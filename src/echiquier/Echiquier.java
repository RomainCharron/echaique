/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echiquier;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Echiquier {

    static private Case table[][];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Echiquier.table = new Case[8][8];
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(j % 2 == 0)
                {
                    Echiquier.table[i][j] = new Case(i % 2 == 0 ? Case.Couleur.noir : Case.Couleur.blanc, null);
                }
                else
                {
                    Echiquier.table[i][j] = new Case(i % 2 == 0 ? Case.Couleur.blanc : Case.Couleur.noir, null);
                }
            }
        }
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {
                System.out.print((table[i][j].lacouleur == Case.Couleur.noir ? " " : "#"));
            }
            System.out.println("");
        }
        
        ArrayList<Integer> listCoups = new ArrayList();
        
        // Jouer
        {
            // mise à zero de tous le paramétre
            int indC = 0;
            clearCASE();
            Cavalier leCavalier = new Cavalier(null);
            int xCavalier = 0 , zCavalier = 0; // permet de connaitre la position de la piece
            table[xCavalier][zCavalier].laPiece = leCavalier;// on place la piece
            listCoups = new ArrayList();
            boolean isplay;
            do {
                
                for (int indM = 0; indM < table[xCavalier][zCavalier].laPiece.getMovementList().size(); indM++) {
                    playsCoupsLstCoups(xCavalier,zCavalier,indM);
                }
                do {                    
                    isplay = false;
                    
                    
                    
                } while (isplay);
                    
                    
                
                listCoups.add(indC);// Crée un coups
                
                
                indC++;
            } while (indC < 64);
        }
        
        
        
    }
    /**
     * xPiece zPiece represent la position de la pice à déplacer
     * @param xPiece 
     * @param zPiece
     * @param leMovement
     * @return 
     */
    static private boolean testCoups(int xPiece,int zPiece,int idMovementPiece){
        Movement leMovement = table[xPiece][zPiece].laPiece.getMovementList().get(idMovementPiece);
        if(table[leMovement.vectorX][leMovement.vectorZ].laPiece == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * xPiece zPiece represent la position de la pice à déplacer
     * @param xPiece 
     * @param zPiece
     * @param leMovement
     * @return 
     */
    static private boolean playsCoupsLstCoups(int xPiece,int zPiece,int idMovementPiece){
        if(testCoups(xPiece, zPiece, idMovementPiece))
        {
            Movement leMovement = table[xPiece][zPiece].laPiece.getMovementList().get(idMovementPiece);
            table[leMovement.vectorX][leMovement.vectorZ].laPiece = table[xPiece][zPiece].laPiece;
            table[xPiece][zPiece].laPiece = new VoidPiece();
            return true;
        }
        else
        {
            return false;
        }
    }
    
    static private boolean clearCASE(){
        boolean isbreak = false;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Echiquier.table[i][j].laPiece = null;
                
            }
            if(isbreak)break;
        }
        return !isbreak ;
    }
    
    
    static private boolean isVisitedAllCASE(){
        boolean isbreak = false;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(Echiquier.table[i][j].laPiece == null)
                {
                    isbreak = true;
                    break;
                }
            }
            if(isbreak)break;
        }
        return !isbreak ;
    }
    
    private int Mouvement(Movement leMovement){
        
        
        return 1;
    }
}

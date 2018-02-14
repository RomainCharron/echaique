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
            do {
                listCoups = new ArrayList();
                
                
                listCoups.add(0);// Crée un coups
                
            } while (true);
        }
        
        
        
    }
    static private boolean ClearCASE(){
        boolean isbreak = false;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Echiquier.table[i][j].laPiece = null;
                
            }
            if(isbreak)break;
        }
        return !isbreak ;
    }
    
    static private boolean IsVisitedCASE(){
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

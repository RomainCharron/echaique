/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echiquier;

/**
 *
 * @author Formation
 */
public class Case {
    
    Couleur lacouleur;
    Piece laPiece;

    public Case(Couleur lacouleur, Piece laPiece) {
        this.lacouleur = lacouleur;
        this.laPiece = laPiece;
    }
    
    
    
    public enum Couleur {
        noir,
        blanc
    } 
}
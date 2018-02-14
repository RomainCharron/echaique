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
public class MovementSP extends Movement{
    public Piece esclaPiece;

    public MovementSP(int vectorX, int vectorY, Type leType,Piece esclaPiece) {
        super(vectorX, vectorY, leType);
        this.esclaPiece = esclaPiece;
    }
    
}

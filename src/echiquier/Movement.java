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
public class Movement {
    
    public int vectorX , vectorZ;
    public Type leType;

    public Movement(int vectorX,int vectorZ, Type leType) {
        this.vectorX = vectorX;
        this.vectorZ = vectorZ;
        this.leType = leType;
    }
    
    
    
    public enum Type {
        simple,
        Jump
    }
}

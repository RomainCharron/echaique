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
    
    public int vectorX , vectorY;
    public Type leType;

    public Movement(int vectorX,int vectorY, Type leType) {
        this.vectorX = vectorX;
        this.vectorY = vectorY;
        this.leType = leType;
    }
    
    
    
    public enum Type {
        simple,
        Jump
    }
}

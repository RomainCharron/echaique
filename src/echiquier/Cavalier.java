/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echiquier;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Cavalier implements Piece{

    static private ArrayList<Movement> lesMove;
    
    private Color lacoucleur;
    
    static {
        
        Cavalier.lesMove = new ArrayList<>();
        Cavalier.lesMove.add(new Movement(2, -1, Movement.Type.Jump));
        Cavalier.lesMove.add(new Movement(2, 1, Movement.Type.Jump));
        
        Cavalier.lesMove.add(new Movement(1, -2, Movement.Type.Jump));
        Cavalier.lesMove.add(new Movement(1, 2, Movement.Type.Jump));
        
        Cavalier.lesMove.add(new Movement(-2, -1, Movement.Type.Jump));
        Cavalier.lesMove.add(new Movement(-2, 1, Movement.Type.Jump));
        
        Cavalier.lesMove.add(new Movement(-1, -2, Movement.Type.Jump));
        Cavalier.lesMove.add(new Movement(-1, 2, Movement.Type.Jump));
    }
    
    public Cavalier(Color lacoucleur) {
        this.lacoucleur = lacoucleur;
    }
    
    

    @Override
    public ArrayList<Movement> getMovementList() {
        return Cavalier.lesMove;
    }

    @Override
    public Color getColor() {
        return this.lacoucleur;
    }

    
    
    
}

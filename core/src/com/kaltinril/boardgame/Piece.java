package com.kaltinril.boardgame;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by thisisme1 on 5/29/2017.
 */

class Piece {
    private Spritz sprite;      // Position, rotation, etc
    private PieceType type;     // What kind of peice is this?  Is it a player peice, or an idol?  This should be configurable
    private int space;  // How much does this take up in a land?

    public Piece(){

    }

    public int getSpace(){
        return space;
    }

    public void setSpace(int newSpace){
        this.space = newSpace;
    }

    public Vector2 getPosition(){
        return sprite.getCenter();
    }

    public void setPosition(Vector2 newPosition){
        sprite.setCenter(newPosition);
    }

}

package com.kaltinril.boardgame;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

/**
 * Created by thisisme1 on 5/29/2017.
 */

class Land {
    Rectangle boundary;             // Where is this on the game board
    Array<Piece> pieces;            // What peices are on this land?
    Array<PieceType> allowedTypes; // What types of pieces are allowed to go on this land?

    private int maxCapacity;
    private int currentCapacity;    // How many peices can fit on the board?


    public Land(){
        pieces = new Array<Piece>();
    }

    public void addPiece(Piece piece){
        if (pieceCanFit(piece)) {
            //TODO: Add code here to move the piece off old land


            pieces.add(piece);
            piece.setPosition(new Vector2(0,0));
            currentCapacity -= piece.getSpace();    // Make sure we subtract the capacity

        }

        //TODO: Should we generater an error ?
    }

    public boolean pieceCanFit(Piece piece){
        return ((this.currentCapacity - piece.getSpace()) >= 0);
    }
}

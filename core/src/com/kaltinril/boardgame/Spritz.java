package com.kaltinril.boardgame;

/**
 * Created by thisisme1 on 5/29/2017.
 */

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class Spritz extends Sprite {

    public Spritz (Texture texture) {
        super(texture);
    }

    public Spritz (Texture t, Vector2 size, float rotation) {
        super(t);
        this.setSize(size);
        this.setOriginCenter();
        this.setRotation(rotation);
    }

    public Vector2 getCenter() {
        return new Vector2(this.getCenterX(), this.getCenterY());
    }

    public float getCenterX() {
        return super.getX() + super.getOriginX();
    }

    public float getCenterY() {
        return super.getY() + super.getOriginY();
    }

    public void setCenter(Vector2 position){
        super.setCenter(position.x, position.y);
    }

    public void setSize(Vector2 size) {
        super.setSize(size.x, size.y);
    }
}
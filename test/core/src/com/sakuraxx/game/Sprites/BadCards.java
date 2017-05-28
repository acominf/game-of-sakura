package com.sakuraxx.game.Sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by mendezrodriguez on 27/05/17.
 */
public class BadCards extends Cards{
    public BadCards(World world, TiledMap tiledMap, Rectangle rectangle){

        super(world, tiledMap, rectangle);
        fixture.setUserData(this);
    }

    @Override
    public void onlinea() {
        Gdx.app.log("BadCards", "Collision");

    }
}

package com.ajeffcorrigan.game.rfrvector;

import com.ajeffcorrigan.game.rfrvector.screens.PlayScreen;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RunFoxRunVector extends Game {

	public static int gw;
	public static int gh;
	public static final boolean DEBUGON = true;			//Is debug enabled.
	public static final float PTM = 100f;

	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {

		gw = Gdx.graphics.getWidth();
		gh = Gdx.graphics.getHeight();

		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));

		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		super.render();

	}
	
	@Override
	public void dispose () {
		super.dispose();
		batch.dispose();
	}
}

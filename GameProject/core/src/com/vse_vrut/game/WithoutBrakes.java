package com.vse_vrut.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class WithoutBrakes extends Game {

	@Override
	public void create() {
		setScreen(new GameplayWB());
	}
}

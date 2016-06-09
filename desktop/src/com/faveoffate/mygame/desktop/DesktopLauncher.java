package com.faveoffate.mygame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.faveoffate.mygame.MyGame;
import com.faveoffate.mygame.MyGameScreen;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "MyGame";
		config.width = 480;
		config.height = 800;
		new LwjglApplication(new MyGame(), config);

	}
}

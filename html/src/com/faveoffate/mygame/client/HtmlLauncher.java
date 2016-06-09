package com.faveoffate.mygame.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.faveoffate.mygame.MyGame;
import com.faveoffate.mygame.MyGameScreen;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(480, 800);
        }

        @Override
        public ApplicationListener getApplicationListener () {
                return new MyGame();
        }

        @Override
        public ApplicationListener createApplicationListener () {
                return new MyGame();
        }
}
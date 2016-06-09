package com.faveoffate.mygame;

public class World {
    public static final float WORLD_WIDTH = 480;
    public static final float WORLD_HEIGHT = 480 * 5;

    public float heightSoFar;

    public World() {
        generateLevel();
        this.heightSoFar = 0;
    }

    private void generateLevel() {

    }
}

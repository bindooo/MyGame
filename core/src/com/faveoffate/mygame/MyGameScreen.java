package com.faveoffate.mygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

public class MyGameScreen implements Screen {
	final MyGame game;

	Texture bucketImage;
	Rectangle bucket;
	OrthographicCamera camera;
	boolean rightwards;

	public MyGameScreen(final MyGame gam) {
		this.game = gam;

		bucketImage = new Texture(Gdx.files.internal("bucket.png"));

		camera = new OrthographicCamera();
		camera.setToOrtho(false, 480, 800);

		bucket = new Rectangle();
		bucket.x = 480 / 2 - 64 / 2;
		bucket.y = 20;

		bucket.width = 64;
		bucket.height = 64;

		rightwards = true;
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();

		game.batch.setProjectionMatrix(camera.combined);

		game.batch.begin();
		game.batch.draw(bucketImage, bucket.x, bucket.y, bucket.width, bucket.height);
		game.batch.end();

		if (rightwards)
			bucket.x += 200 * Gdx.graphics.getDeltaTime();
		else
			bucket.x -= 200 * Gdx.graphics.getDeltaTime();

		if (Gdx.input.justTouched()) {
			if (rightwards)
				rightwards = false;
			else
				rightwards = true;
		}

		if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
			rightwards = false;
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
			rightwards = true;

		if (bucket.x < 0)
			bucket.x = 0;
		if (bucket.x > 480 - 64)
			bucket.x = 480 - 64;
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {
		bucketImage.dispose();
	}
}

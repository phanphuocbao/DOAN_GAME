package doan.dev;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

import doan.dev.game.GameScreen;
import doan.dev.handlers.FacebookHandler;
import doan.dev.handlers.GameServicesHandler;
import doan.dev.handlers.RequestHandler;
import doan.dev.screens.Screens;

public class Main extends Game {

	public final GameServicesHandler gameServiceHandler;
	public final RequestHandler reqHandler;
	public final FacebookHandler facebookHandler;

	public Stage stage;
	public SpriteBatch batcher;

	public Main(RequestHandler reqHandler, GameServicesHandler gameServiceHandler, FacebookHandler facebookHandler) {
		this.reqHandler = reqHandler;
		this.gameServiceHandler = gameServiceHandler;
		this.facebookHandler = facebookHandler;
	}

	@Override
	public void create() {

		batcher = new SpriteBatch();
		stage = new Stage(new StretchViewport(Screens.SCREEN_WIDTH, Screens.SCREEN_HEIGHT));

		Settings.load();
		Assets.load();
		Achievements.init(this);
		setScreen( (Screen) new GameScreen(this, true));
//Baor
	}

}
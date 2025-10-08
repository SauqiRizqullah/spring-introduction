package com.in28minutes.spring.learn_spring_framework.game;

public class GameRunner {
	
//	private MarioGame game;
	
//	private SuperContraGame game;
	
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		// TODO Auto-generated constructor stub
//		this.game = game;
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		game.up();
		game.down();
		game.left();
		game.right();

	}

	
}

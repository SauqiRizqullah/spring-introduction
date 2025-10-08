package com.in28minutes.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.spring.learn_spring_framework.game.GameRunner;
import com.in28minutes.spring.learn_spring_framework.game.MarioGame;
import com.in28minutes.spring.learn_spring_framework.game.PacmanGame;
import com.in28minutes.spring.learn_spring_framework.game.SuperContraGame;
import com.in28minutes.spring.learn_spring_framework.game.GamingConsole;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContraGame contraGame = new SuperContraGame();
//		PacmanGame pacman = new PacmanGame();
		GamingConsole game = new PacmanGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}

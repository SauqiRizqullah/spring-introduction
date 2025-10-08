package com.in28minutes.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learn_spring_framework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learn_spring_framework.game.GameRunner;

@SpringBootApplication
//@ComponentScan("com.in28minutes.spring.learn_spring_framework")
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(LearnSpringFrameworkApplication.class, args); //create app context
//		MarioGame game = new MarioGame();
//		SuperContraGame contraGame = new SuperContraGame();
//		PacmanGame pacman = new PacmanGame();
//		GamingConsole game = new PacmanGame();
//		GameRunner runner = new GameRunner(game);
//		runner.run();
		GameRunner runner = context.getBean(GameRunner.class);
		
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}

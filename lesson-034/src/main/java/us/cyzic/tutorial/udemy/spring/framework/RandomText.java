package us.cyzic.tutorial.udemy.spring.framework;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomText {

	private static String[] texts = {
			"I'll be back",
			"Get out!",
			"I want your clothes, boots, and motorcycle",
			"Beep - Beep - Beep",
			"Danger Will Robinson, Danger!!",
			"Sarah Connor?",
			"Woofie's fine, Honey",
			"Kiss my shiny, metal ass",
			"I like bending"
	};
	
	public String getText() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}
}

package us.cyzic.tutorial.udemy.spring.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Robot {
	
	private String id = "Default robot";
	private String speech = "Hello";

	public void setId(String id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("${jdbc.password}")String speech) {
		this.speech = speech;
	}

	public void speak() {
		System.out.println(id + ": " + speech);
	}

}

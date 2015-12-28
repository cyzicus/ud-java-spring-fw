package us.cyzic.tutorial.udemy.spring.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	private String id = "Default robot";
	private String speech = "Hello";
	
	@Autowired
	public void setId(@Value("T2") String id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("#{randomText.getText()}") String speech) {
		this.speech = speech;
	}

	public void speak() {
		System.out.println(id + ": " + speech);
	}

}

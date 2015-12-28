package us.cyzic.tutorial.udemy.spring.framework;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println(text);
	}

}

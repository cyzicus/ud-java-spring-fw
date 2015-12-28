package us.cyzic.tutorial.udemy.spring.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Logger {
	
	@Autowired
	private ConsoleWriter consoleWriter;
	
	@Autowired
	private FileWriter fileWriter;
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
			consoleWriter.write(text);
	}
	
}

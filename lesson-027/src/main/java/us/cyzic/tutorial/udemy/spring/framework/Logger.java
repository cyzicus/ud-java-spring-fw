package us.cyzic.tutorial.udemy.spring.framework;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {
	
	@Autowired(required=false)
	private ConsoleWriter consoleWriter;
	
	@Autowired
	private FileWriter fileWriter;
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		if(consoleWriter != null) {
			consoleWriter.write(text);
		}
	}

}

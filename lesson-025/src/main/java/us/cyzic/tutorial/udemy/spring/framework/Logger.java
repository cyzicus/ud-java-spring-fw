package us.cyzic.tutorial.udemy.spring.framework;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {
	
	// @Autowired // can be on the variable declaration
	private ConsoleWriter consoleWriter;
	
	@Autowired // don't even need a setter for a private variable when autowiring
	private FileWriter fileWriter;
	
	@Autowired // can autowire on the constructor
	public Logger(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	// @Autowired
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
//	@Autowired // can be mixed with constructor autowiring if no conflicts
//	public void setFileWriter(FileWriter fileWriter) {
//		this.fileWriter = fileWriter;
//	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

}

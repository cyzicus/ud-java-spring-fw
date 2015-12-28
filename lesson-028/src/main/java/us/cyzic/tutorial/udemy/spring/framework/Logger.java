package us.cyzic.tutorial.udemy.spring.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {
	
	@Autowired
	@Qualifier("usethisone")
	private LogWriter consoleWriter;
	
	@Autowired
	@Qualifier("iamafilewriter")
	private LogWriter fileWriter;
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
			consoleWriter.write(text);
	}

}

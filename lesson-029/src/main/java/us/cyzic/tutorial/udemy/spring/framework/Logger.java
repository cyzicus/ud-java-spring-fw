package us.cyzic.tutorial.udemy.spring.framework;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {
	
	@Resource
	private LogWriter consoleWriter;
	
	@Resource(name="squirrel")
	private LogWriter fileWriter;
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
			consoleWriter.write(text);
	}

}

package us.cyzic.tutorial.udemy.spring.framework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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

	@PostConstruct
	public void init() {
		System.out.println("Happy Birthday!!!");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("I'm meltttiiinnnggg...");
	}
	
}

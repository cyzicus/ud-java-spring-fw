package us.cyzic.tutorial.udemy.spring.framework;

public class ConsoleWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println(text);
	}

}

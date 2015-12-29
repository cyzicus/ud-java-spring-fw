package us.cyzic.tutorial.udemy.spring.framework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("us/cyzic/tutorial/udemy/spring/framework/beans/beans.xml");
		
		Robot robot = (Robot)context.getBean("robot");
		robot.speak();
		
		context.close();
	}

}

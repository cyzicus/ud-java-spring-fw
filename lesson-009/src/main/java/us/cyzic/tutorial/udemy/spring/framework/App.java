package us.cyzic.tutorial.udemy.spring.framework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("us/cyzic/tutorial/udemy/spring/framework/beans/beans.xml");
		
		Person person = (Person)context.getBean("person");
		
		System.out.println(person);
		person.speak();
		
		context.close();
	}

}

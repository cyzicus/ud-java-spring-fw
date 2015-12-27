package us.cyzic.tutorial.udemy.spring.framework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("us/cyzic/tutorial/udemy/spring/framework/beans/beans.xml");
		
		Person person = (Person)context.getBean("person");
		Address address = (Address)context.getBean("address");
		
		System.out.println(person);
		System.out.println(address);
		person.speak();
		
		context.close();
	}

}

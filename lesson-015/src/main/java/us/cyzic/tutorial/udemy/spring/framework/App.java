package us.cyzic.tutorial.udemy.spring.framework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("us/cyzic/tutorial/udemy/spring/framework/beans/beans.xml");
		
		FruitBasket basket = (FruitBasket)context.getBean("basket");
		System.out.println(basket.toString());
		
		context.close();
	}

}

package us.cyzic.tutorial.udemy.spring.framework;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("us/cyzic/tutorial/udemy/spring/framework/beans/beans.xml");
		
		OffersDAO offersDao = (OffersDAO)context.getBean("offersDao");
		
		List<Offer> offers = offersDao.getOffers();
		
		for(Offer offer:offers) {
			System.out.println(offer.toString());
		}
		
		context.close();
	}

}

package us.cyzic.tutorial.udemy.spring.framework;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"us/cyzic/tutorial/udemy/spring/framework/beans/beans.xml");

		OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");
		
		try {
			
//			if(offersDao.delete(4) && offersDao.delete(8))
//			{
//				System.out.println("Offer deleted");
//			} else {
//				System.out.println("Error deleting offer");
//			}
			
			Offer fred = new Offer("Fred", "fred@nowhere.com", "will code for food");
			if(offersDao.create(fred)) {
				System.out.println("Created offer: " + fred);
			} else {
				System.out.println("Error creating offer: " + fred);
			}
			
			List<Offer> offers = offersDao.getOffers();

			System.out.println("All offers:");
			for (Offer offer : offers) {
				System.out.println(offer.toString());
			}
			
			Offer offer = offersDao.getOffer(2);
			System.out.println("Should be Mike: " + offer);
			
			offer.setEmail("newEmailAddress.com");
			offer.setName("Jason");
			offer.setText("just want to work for pivotal");
			
			if(offersDao.update(offer)) {
				System.out.println("Updated offer: " + offer);
			} else {
				System.out.println("Error updating offer: " + offer);
			}
			
			offer = offersDao.getOffer(2);
			System.out.println("Should now be Jason: " + offer);
			
			List<Offer> bethAndMel = new ArrayList<Offer>();
			
			bethAndMel.add((new Offer("Beth", "beth@whatever.com", "PHP programmer for hire")));
			bethAndMel.add((new Offer("Mel", "mel@whatever.com", "Another PHP programmer for hire")));
			
			if(offersDao.create(bethAndMel)) {
				System.out.println("Successfully added Beth and Mel");
			} else {
				System.out.println("An error occurred adding Beth and Mel");
			}
			
		} catch (CannotGetJdbcConnectionException ex) {
			System.out.println("Cannot connect to database");
		} catch (DataAccessException dae) {
			System.out.println(dae.getMessage());
			System.out.println(dae.getClass());
		} catch (Exception ex) {
			System.out.println("Exception caught: " + ex.getMessage());
			System.out.println("Exception type: " + ex.getClass());
		}

		context.close();
	}

}

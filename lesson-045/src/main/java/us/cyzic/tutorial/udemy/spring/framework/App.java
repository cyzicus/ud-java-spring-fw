package us.cyzic.tutorial.udemy.spring.framework;

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
			List<Offer> offers = offersDao.getOffers();

			System.out.println("All offers:");
			for (Offer offer : offers) {
				System.out.println(offer.toString());
			}
			
			Offer offer = offersDao.getOffer(2);
			System.out.println("Should be Mike: " + offer);
			
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

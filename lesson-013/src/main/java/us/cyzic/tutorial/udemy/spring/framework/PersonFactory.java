package us.cyzic.tutorial.udemy.spring.framework;

public class PersonFactory {

	public Person createPerson(int id, String name) {
		System.out.println("Using factory class to create person");
		return new Person(id, name);
	}
	
}

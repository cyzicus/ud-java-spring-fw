package us.cyzic.tutorial.udemy.spring.framework;

public class Person {

	private int id;
	private String name;
	
	private int taxId;

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
	}

	public void speak() {
		System.out.println("Hello, I am still a person");
	}
	
}

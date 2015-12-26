package us.cyzic.tutorial.udemy.spring.framework;

public class Person {

	private int id;
	private String name;
	
	private int taxId;
	private Address address;

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void onCreate() {
		System.out.println("Person created: " + this);
	}
	
	public void onDestroy() {
		System.out.println("Person destroyed: " + this);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	public void speak() {
		System.out.println("Hello, I am still a person");
	}
	
}

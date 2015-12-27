package us.cyzic.tutorial.udemy.spring.framework;

import java.util.List;
import java.util.stream.Collectors;

public class FruitBasket {

	private String name;
	private List<String> fruits;
	
	public FruitBasket(String name, List<String> fruits) {
		super();
		this.name = name;
		this.fruits = fruits;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(" contains:\n");
		
		String listOfFruits = fruits.stream()
			.map(item -> item)
			.collect(Collectors.joining("\n"));
		
		sb.append(listOfFruits);
		
		return sb.toString();
	}

	
	
	
	
}

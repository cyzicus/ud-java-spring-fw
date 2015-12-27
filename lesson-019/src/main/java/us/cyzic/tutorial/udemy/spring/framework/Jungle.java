package us.cyzic.tutorial.udemy.spring.framework;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Jungle {
	
	private Animal largest;

	private Map<String, String> foods = new HashMap<String, String>();
	private Map<String, Animal> animals = new HashMap<String, Animal>();

	public Animal getLargest() {
		return largest;
	}

	public void setLargest(Animal largest) {
		this.largest = largest;
	}
	
	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Largest: " + largest);
		sb.append("\n");
		sb.append("\nAll animals:\n");

		
		String animalString = animals.entrySet().stream()
								.map(animal -> animal.getKey() + ": " + animal.getValue())
								.collect(Collectors.joining("\n"));
		
		sb.append(animalString);
		
		sb.append("\n\nFoods:\n");
		
		String foodString = foods.entrySet().stream()
								.map(food -> food.getKey() + ": " + food.getValue())
								.collect(Collectors.joining("\n"));
		sb.append(foodString);
		
		return sb.toString();
	}
	
	

}

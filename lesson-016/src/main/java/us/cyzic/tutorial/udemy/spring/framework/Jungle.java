package us.cyzic.tutorial.udemy.spring.framework;

import java.util.List;
import java.util.stream.Collectors;

public class Jungle {
	
	private Animal largest;
	private List<Animal> animals;
	
	public Jungle(Animal largest, List<Animal> animals) {
		super();
		this.largest = largest;
		this.animals = animals;
	}
	
	public Jungle() {
		
	}

	public Animal getLargest() {
		return largest;
	}

	public void setLargest(Animal largest) {
		this.largest = largest;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Largest: " + largest);
		sb.append("\n");
		sb.append("All animals:\n");
		
		String otherAnimals = animals.stream()
			.map(item -> item.toString())
			.collect(Collectors.joining("\n"));
		
		sb.append(otherAnimals);
		
		return sb.toString();
	}
	
	

}

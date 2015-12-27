package us.cyzic.tutorial.udemy.spring.framework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Jungle {
	
	private Map<String, String> foods = new HashMap<String, String>();

	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, String> entry: foods.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		return sb.toString();
	}
	
	

}

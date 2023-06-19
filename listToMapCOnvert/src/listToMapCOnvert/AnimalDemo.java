package listToMapCOnvert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnimalDemo {

	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Animal(1,"Dog"));
		animalList.add(new Animal(2,"Cat"));
		animalList.add(new Animal(3,"Lion"));
		animalList.add(new Animal(4,"Horse"));
		animalList.add(new Animal(5,"Cow"));
		
		/*
		 * Map listToMap = Animal.convertListToMap(animalList);
		 * System.out.println(listToMap);
		 */
		
		/* COnvert List to Map by using Java 8*/
		
		Map<Integer, Animal> map = animalList.stream().collect(Collectors.toMap(Animal::getAnimalId,Function.identity()));
	}
}

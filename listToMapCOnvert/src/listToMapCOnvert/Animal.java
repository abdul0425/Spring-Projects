package listToMapCOnvert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Animal {

	int animalId;
	String animalName;
	public Animal(int animalId, String animalName) {
		super();
		this.animalId = animalId;
		this.animalName = animalName;
	}
	
	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	

	@Override
	public String toString() {
		return "Animal [animalId=" + animalId + ", animalName=" + animalName + "]";
	}

	public static Map convertListToMap(List<Animal> animalList) {
		Map<Integer,String> map = new HashMap<>();
		for(Animal animal : animalList) {
			map.put(animal.getAnimalId(), animal.animalName);
		}
		return map;
	}
	
}

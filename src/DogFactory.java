
public class DogFactory {
	public Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("Dog")) {
			return new Dog(animalType, 0, 0, 0, 0, animalType, animalType);
		}
		else {
			System.out.println(animalType + " is not recognized by DogFactory.");
			return null;
		}
	}
}

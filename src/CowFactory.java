
public class CowFactory {
	public Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("cow")) {
			return new Cow(animalType, 0, 0, 0, 0, animalType, animalType);
		}
		else {
			System.out.println(animalType + " is not recognized by CowFactory.");
			return null;
		}
	}
}

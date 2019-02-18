
public class CatFactory {
	public Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("Cat")) {
			return new Cat(animalType, 0, 0, 0, 0, animalType, animalType);
		}
		else {
			System.out.println(animalType + " is not recognized by CatFactory.");
			return null;
		}
	}
}

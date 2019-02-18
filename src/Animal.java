
public class Animal {
	private String name;
	private int age;
	private float length;
	private float height;
	private float weight;
	private String gender;
	private String scientificName;
	
	public static void main(String[] args) {
		CatFactory catFactory = new CatFactory();
		CowFactory cowFactory = new CowFactory();
		DogFactory dogFactory = new DogFactory();
		
		Animal cat = catFactory.getAnimal("cat");
		cat.getName();
		
		Animal cow = cowFactory.getAnimal("cow");
		cow.getName();
		
		Animal dog = dogFactory.getAnimal("dog");
		dog.getName();
	}
	
	private Animal(AnimalBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.length = builder.length;
		this.height = builder.height;
		this.weight = builder.weight;
		this.gender = builder.gender;
		this.scientificName = builder.scientificName;
	}
	
	public Animal (String name, int age, float length, float height, float weight, String gender, String scientificName) {
		this.name = name;
		this.age = age;
		this.length = length;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.scientificName = scientificName;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getHeight() {
		return height;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getScientificName() {
		return scientificName;
	}
	
	public static class AnimalBuilder {
		public String scientificName;
		public String gender;
		public float weight;
		public float height;
		public float length;
		public int age;
		private String name;
	}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnimalFactoryHelper {

	public static void main(String[] args) {
		List<String> animalList = new ArrayList<String>();
        Scanner stdin = new Scanner(System.in);

        do {
            System.out.println("Current list is " + animalList);
            System.out.println("Add more? (y/n)");
            if (stdin.next().startsWith("y")) {
                System.out.println("Enter : ");
                animalList.add(stdin.next());
            } else {
                break;
            }
        } while (animalList.size() <= 4);
        stdin.close();
        System.out.println("List is " + animalList);
        String[] arr = animalList.toArray(new String[0]);
        System.out.println("Array is " + Arrays.toString(arr));
        
        if(stdin.next().startsWith("exit")) {
        	System.out.println(arr);
        }
        if (stdin.next().startsWith("cow")) {
        	CowFactory cowFactory = new CowFactory();
        }
        else if (stdin.next().startsWith("dog")) {
        	DogFactory dogFactory = new DogFactory();
        }
        else if (stdin.next().startsWith("cat")) {
        	CatFactory catFactory = new CatFactory();
        }
        else {
        	System.out.println("Animal Tyle is not recognized by AnimalFactorys.");
        }
//        if(arr.length >= 5) {
//        	// Step 1 <~~~~~~~~~~~~~~~
//        	for (int i = 0;i < 5;i++){
//    			System.out.println("number " + i + ": " + arr[i]);
//    		}
//
//    		// Step 2 <~~~~~~~~~~~~~~~
//    		for (int x = 4;x >= 0;x--)   {
//    			System.out.println("number " + x + ": " + arr[x]);
//    		}
//    		
//    		// Step 3 <~~~~~~~~~~~~~~~
//    		for (int i = 0;i < 5;i++){
//    			if (arr.length%2 == 1) {
//    				System.out.println("Odd number " + i + ": " + arr[i]);
//    			}
//    		}
//        }
	}
	
    @SuppressWarnings("resource")
    public static String ReadInputString(){
        // declare a new Scanner object
        Scanner scan = new Scanner(System.in);

        // read in user input and store it in the scanned variable
        String scanned = scan.nextLine();

        // return the String result to wherever the "StudentHelper.ReadInputString()" is called
        return scanned;
    }

    @SuppressWarnings("resource")
    public static int ReadInputInt(){
        // declare a new Scanner object
        Scanner scan = new Scanner(System.in);

        // read in user input and store it in the scanned variable
        int scanned = scan.nextInt();

        // return the int result to wherever the "StudentHelper.ReadInputInt()" is called
        return scanned;
    }

}

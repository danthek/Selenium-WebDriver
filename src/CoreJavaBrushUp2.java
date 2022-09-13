import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {

		int[] array3 = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };

		// print only values multiples by 2
		// 2,4,6,8,10,122
		for (int i = 0; i < array3.length; i++) {
			// System.out.println(array3[i]); //prints all the elements
			if (array3[i] % 2 == 0) { // if the element in the array is divided by 2 and its residual =0
				System.out.println(array3[i]); // prints all the elements
				break; // with this we exit the for loop when the condition (array3[i] % 2 == 0) has
						// been met
			} else {
				System.out.println(array3[i] + " Its not multiple of 2"); 
			}
		}

		// Array List
		System.out.println("/////////// Array List //////////////");
		
		System.out.println("---------With strings--------------");
		// create an object of the ArrayList class, data type must be indicated
		ArrayList<String> playstation = new ArrayList<String>();
		// access method of the class-> object.method
		playstation.add("Devil May Cry");
		playstation.add("God of War");
		playstation.add("Onimusha");
		playstation.add("FIFA");
		playstation.add("Prince of Persia");
		System.out.println(playstation.get(1));
		System.out.println(playstation.get(2));
		// removes desired item on the indicated position
		System.out.println(playstation.remove(2) + " has been removed from the array");
		System.out.println("The playstation games left in the array are: ");
		for (String games : playstation) {
			System.out.println(games);
		}
		//Numbers
		System.out.println("---------With numbers--------------");
		int i;
		int x = 0;
		ArrayList<Integer> ages = new ArrayList<Integer>();
		for (i = 0; i < 15; i++) {
			ages.add(i);
		}
		System.out.println("The ages in the array are: " + i);
		
		for (int y = 0; y < i; y++) {
			System.out.println(ages.get(y));
		}
		// we extract a value from an array position
		int value = ages.get(4);
		System.out.println(value + " value must be 5");
		// removes desired item on the indicated position
		System.out.println(ages.remove(2) + " age has been removed from the array");
		for (x = 0; x < i - 1; x++) {
			System.out.println(ages.get(x));
		}
		System.out.println("The total size left of the array now is: " + x);
		
	}

}

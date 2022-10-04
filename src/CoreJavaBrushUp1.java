
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {

		// Variables
		int myNum = 5; // number
		String myName = "Abraham"; // strings
		String changingVariable =""; // strings
		char letter = 'r'; // characters
		float dec = (float) 5.99; // decimals
		double decim = 7.99; // decimals
		boolean hobbie = true; // true/false

		System.out.println(myNum + " is the value stored in the myNum variable " + myName + " " + letter + " " + dec
				+ " " + decim + " " + hobbie);

		// Arrays
		int[] myArray = new int[5]; // first we must indicate how many values is going to store
		
		myArray[0] = 11;
		myArray[1] = 31;
		myArray[2] = 14;
		myArray[3] = 71;
		myArray[4] = 19;
		System.out.println("Array 1: " + myArray[0]); // prints 11

		String[] array2 = { "Testing", "QA", "Selenium", "Abraham" }; // another form of declaring an array
		System.out.println("Array 2: " + array2[2]); // prints Selenium

		// For loop
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Looping Array: " + myArray[i]);

		}

		for (int i = 0; i < array2.length; i++) {
			System.out.println("Looping Array: " + array2[i]);

		}

		for (String keyWord : array2) { // for each array2 element assigned/stored in the new variable kewWord , it gets
										// printed on each iteration
			System.out.println("Enhanced loop form: " + keyWord);
		}

		changingVariable="Name1";
		System.out.println(changingVariable);
		changingVariable="Name2";
		System.out.println(changingVariable);
		changingVariable="Name3";
		System.out.println(changingVariable);
		
	}

}


public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		//Strings in java
		
		// String literal: if the value of the object is the same, no new object is created and no new memory is consumed:
		String salute= "Hello World";
		String salute2= "Hello World";
		String salute3= "Hola Mundo"; // because in this example the value its different, this time it creates a new object and consumes new memory.
		
		// String creation with the use of "new"object. it DOES create a new object and consume new memory:
		String salute4 = new String("Welcome");
		String salute5 = new String("Welcome");
		

		System.out.println("////////////// Split ////////////////");
		// how to Split a string ad save the new slitted elements into an array:

		System.out.println("----------Print character by character------------");
		String salute6 = "Hello My Beautiful World";
		for (int i=0; i< salute6.length(); i++) { // look how length() has a parenthesis here
			System.out.println(salute6.charAt(i)); // trim() removes blank spaces
		}
		
		
		System.out.println("----------Split by blank spaces------------");
		String[] splittedString = salute6.split(" "); // we split it by the blank space
		for (int i=0; i< splittedString.length; i++) {
			System.out.println(splittedString[i]);
		}
		System.out.println("----------Split by a word of the sentence---------------");
		String[] splittedString2 = salute6.split("My"); // we split it by indicated word
		
		for (int i=0; i< splittedString2.length; i++) {
			System.out.println(splittedString2[i].trim()); // trim() removes blank spaces
		}
		
		System.out.println("----------Print in Reverse------------");
		String[] splittedString3 = salute6.split(" "); // we split it by the blank space
		for (int i=(splittedString3.length-1); i >=0; i--) {
			System.out.println(splittedString3[i]);
		}
		
	
	}

}

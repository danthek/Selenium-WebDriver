
public class MethodsExample {

	public static void main(String[] args) {
		System.out.println("///////////////// Methods creation and access ///////////");
//Method Access
		String catchData = "";
		MethodsExample d = new MethodsExample();// class object creation to access its methods (like the getData()).
		System.out.println(d.getData());
		System.out.println("----------External class method access--------------");
		MethodsExample2 s = new MethodsExample2();// External class object creation to access its methods. the class
													// data must be the same as the source external class
		System.out.println(catchData = s.getUserData()); // we assign the method to a variable and it prints the return
															// and the system.out inside
	}

//Method creation
	// define the return type that the method will read
	// void means its reading nothing
	public String getData() {
		System.out.println("A Method has been created");
		return ("This Java course is great!");
	}

}

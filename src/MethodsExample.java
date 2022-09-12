
public class MethodsExample {

	public static void main(String[] args) {
System.out.println("///////////////// Methods creation and access ///////////");
//Method Access
String catchData = "";
MethodsExample d = new MethodsExample();// class object creation to access its methods (like the getData()).
System.out.println(catchData = d.getData()); // we assign the method tu a variable and it prints the return and the system.out inside
System.out.println("----------External class method access--------------");
MethodsExample2 s = new MethodsExample2();// External class object creation to access its methods
System.out.println(catchData = s.getUserData());
	}
//Method creation
	// define the return  type that the method will read
		// void means its reading nothing
	public String getData() {
	System.out.println("A Method has been created");
	return ("This Java course is great!");
	}
	
}
	

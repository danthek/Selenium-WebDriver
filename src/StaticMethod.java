
public class StaticMethod {

	public static void main(String[] args) {
		System.out.println("///////////////// static Methods  ///////////");
		//Static Method Access
		System.out.println(newData()); // we no longer need the "object.method" syntax.
	
		
			}
		//Static Method creation
			// static moves the method to  the class level so it belongs now to the class
			public static String newData() {
			System.out.println("A Static Method has been created");
			return ("No longer we need the \"object.method\" syntax");
			}

	}



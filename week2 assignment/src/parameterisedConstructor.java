
public class parameterisedConstructor {
	 String languages;

	  // constructor accepting single value
	 parameterisedConstructor(String lang) {
	    languages = lang;
	    System.out.println(languages + " Programming Language");
	  }

	  public static void main(String[] args) {

		  parameterisedConstructor obj1 = new parameterisedConstructor("Java");
		  parameterisedConstructor obj2 = new parameterisedConstructor("Python");
		  parameterisedConstructor obj3 = new parameterisedConstructor("C");
	  }

}

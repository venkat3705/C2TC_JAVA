
public class Main5 {
	 // create a method
	  public int addNumbers(int a, int b) {
	    int sum = a + b;
	    // return value
	    return sum;
	  }

	  public static void main(String[] args) {
	    
	    int num1 = 25;
	    int num2 = 15;

	    // create an object of Main
	    Main5 obj = new Main5();
	    // calling method
	    int result = obj.addNumbers(num1, num2);
	    System.out.println("Sum is: " + result);
	  }

}

//program for swapping two variables
public class swap {
	public static void main(String args[])
	{
		int x=100,y=200;
		System.out.println("Before swap...");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After swap...");
		System.out.println("x:"+x);
		System.out.println("y:"+y); 
	}

}

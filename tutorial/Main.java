package tutorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "water";
		String y = "lemonade";
		System.out.println("Before swapping");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		String temp = y;
		y=x;
		x=temp;
		System.out.println("After swapping");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
	}


}

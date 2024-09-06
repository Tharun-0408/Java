package tutorial;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double x;
		double y;
		double z;
		System.out.println("Enter side x: ");
		x=scan.nextDouble();
		System.out.println("Enter side y: ");
		y=scan.nextDouble();
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("Hypotenuse: "+z);

	}

}

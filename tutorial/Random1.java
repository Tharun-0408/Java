package tutorial;
import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int x=0;
		int count =1;
		while(x!=11)
		{
			System.out.println("round "+count);
			x = random.nextInt(10)+1;
			System.out.println(x);
			if(x==6)
			{
				System.out.println("you win");
				break;
			}
			count ++;
		}
		
	}

}

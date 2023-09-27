
import java.util.Scanner;
public class positiveornot {
	public static void main(String [] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		number=sc.nextInt();
		if(number>0)
		{
			System.out.println("the number"+number+"is positive");
		}
		else
		{
			System.out.println("the number"+number+"negative");
		}
		
	}

}

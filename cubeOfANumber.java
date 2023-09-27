import java.util.Scanner;

public class cubeOfANumber {
	public static void main(String [] args) {
		int limit;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of terms:");
		limit=sc.nextInt();
		for(int i=1;i<=limit;i++)
		{
			int cube=i*i*i;
			System.out.println("the number is:" + i + "the cube of" +i+ "is"+cube);
		}
	}

}

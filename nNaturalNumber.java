import java.util.Scanner;

public class nNaturalNumber {
	public static void main(String [] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		number=sc.nextInt();
		System.out.println("the first " +number+" natural numbers are");
		for(int i=1;i<=number;i++)
		{
			System.out.println(i);
		}
	}

}

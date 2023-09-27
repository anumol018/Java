import java.util.Scanner;
public class greatestNumber {
	public static void main(String [] args) {
	int firstNumber,secondNumber,thirdNumber;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers:");
	firstNumber=sc.nextInt();
	secondNumber=sc.nextInt();
	thirdNumber=sc.nextInt();
	if(firstNumber>secondNumber&&firstNumber>thirdNumber)
	{
		System.out.println("the greatest number is" +firstNumber);
	}
	else if(secondNumber>thirdNumber)
	{
		System.out.println("the greatest number is" +secondNumber);
	}
	else
	{
		System.out.println("the greatest number is" +thirdNumber);
	}
	}
}

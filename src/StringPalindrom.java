/********************************************************************************
 * File         : StringPalindrom.java
 * Description  :java program to check whether a string palindrom or not
 * Author       : Anumol V S
 * Version      : 1.0
 * Date         :29/09/2023
 ********************************************************************************/
import java.util.Scanner;
public class StringPalindrom {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String input=sc.next();
		boolean ispalindrome=check(input);
		if(ispalindrome) {
			System.out.println("the given string is palihndrome");
		}
		else {
			System.out.println("the given string is not palihndrome");
		}
		}
		
	/**receive a string as input return true if it is palindrom
	 * else return false**/
	static boolean check(String input) {
		char [] charArray=input.toCharArray();
		int length=input.length();
		for(int i=0;i<=length/2;i++) {
			if(charArray[i]!=charArray[length-i-1]) {
				return false;
				
			}
			}
		return true;
		}
				
		
		
		
		
	
}
	
	

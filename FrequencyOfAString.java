/********************************************************************************
 * File         : FrequencyOfAString.java
 * Description  :java program to find the frequncy of a string
 * Author       : Anumol V S
 * Version      : 1.0
 * Date         :29/09/2023
 ********************************************************************************/
import java.util.Scanner;
public class FrequencyOfAString {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		//input the string
		System.out.println("enter a string");
		String input=sc.nextLine();
		//input the charecter to count hte frquency
		System.out.println("enter a charecter");
		char checkMe=sc.next().charAt(0);
		int charCount=checkFreq(input,checkMe);
		System.out.println("the occurence of the given charecter is "+charCount);
	}
    static int checkFreq(String input,char checkMe) {
    	char [] charArray=input.toCharArray();
    	int charCount=0;
    	for(int i=0;i<input.length();i++) {
    		if(charArray[i]==checkMe) {
    			charCount++;
    		}
    	}
    	return charCount;
    }
}

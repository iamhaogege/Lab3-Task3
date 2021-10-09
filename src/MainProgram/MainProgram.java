package MainProgram;
import java.util.Scanner;
public class MainProgram {
	
	public static void main(String[] args) {
		String string1, string2;
		StringBuilder builder = new StringBuilder();
		int i,j;
		System.out.println(builder);
		
		do {
//			Require 5
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the first string.");
			string1 = sc.nextLine();
			System.out.println("Please enter the second string.");
			string2 = sc.nextLine();
			
//			Require 6
			System.out.println("The length of the first string is:" + string1.length());
			System.out.println("The lenght of the first string is:" + string2.length());
			
//			Require 7
			if(string1.equals(string2)) {
				System.out.println("Two string are equals");
				
			}
			
//			Require 8
			if(string1.equalsIgnoreCase(string2)) {
				System.out.println("Two string are equals");
				
//			Require 9
			System.out.println(string1.toUpperCase());
			System.out.println(string2.toUpperCase());
			}
				
//			Require 10 11
			if(string1.indexOf(string2)>=0)
			{
				System.out.println("string1 contains string2");
				System.out.println("The first occurrence of string2 is " + string1.indexOf(string2));
				System.out.println("the last ocurrence of string2 is " + string1.lastIndexOf(string2));
			}
			else {
				System.out.println("The string1 isn't contain the string2");	
			}
			
//			Require 12
			System.out.println("Please enter the first integer: ");
			i = sc.nextInt();
			System.out.println("Please enter the second integer: ");
			j = sc.nextInt();
			
			if(i<j&&j<string1.length()) {
				System.out.println("The substrings of the string form positon " + i + " to position " + j + " are: ");
				for(int n = i; n<=j; n++) {
					System.out.println(string1.charAt(n));
				}
				System.out.println();
			}
			
//			Require 13
			builder.append(string2);
			
			}while(string1.equals("end"));
			System.out.println("The value of builder is " + builder);
	}
}


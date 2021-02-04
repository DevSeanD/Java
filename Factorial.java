//Author: Sean Dever
//Description: This program will calculate an inputted number's factorial and then output the result to console.
//File Name: Factorial.java

import java.util.Scanner;  // Import the Scanner class

public class Main {

public static void factorial(int n){
	long product = 1;
	for(int i=1; i<=n; i++){
		product *= i;
	}
	System.out.print(product);
	System.out.print("\n");
}
public static void main(String[] args){
	Scanner inputNum = new Scanner(System.in);
	System.out.print("What number would you like to find the factorial of? ");
	String num = inputNum.nextLine();

	//String to Int
	int intnum = Integer.parseInt(num);

	factorial(intnum);

}
}

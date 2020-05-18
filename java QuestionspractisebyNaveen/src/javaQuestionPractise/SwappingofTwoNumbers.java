package javaQuestionPractise;

import java.util.Scanner;

public class SwappingofTwoNumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first numbers");
		 int a=sc.nextInt();
		 System.out.println("Enter second numbers");
		 int b=sc.nextInt();
		 a=a-b;
		 b=a+b;
		 a=b-a;
		 System.out.println("*****************after swapping******** ");
		 System.out.println("a = "+a);
         System.out.println("b = "+b);		 
		 
		 
		 
	}

}

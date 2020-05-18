package javaQuestionPractise;

import java.util.Scanner;

public class QuotientandRemainder {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		int rem=n/10;
		int quotient=n%10;
		System.out.println("the quotient  is "+rem);
		System.out.println("the remainder  is   "+quotient);
		
	}

}

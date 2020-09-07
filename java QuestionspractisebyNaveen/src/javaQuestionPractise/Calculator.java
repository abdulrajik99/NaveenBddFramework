package javaQuestionPractise;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner reader=new Scanner(System.in);
		System.out.println("Enter two double numbers  :");
		double a=reader.nextDouble();
		double b=reader.nextDouble();
	System.out.println("select an operator  + ,- ,* ,/");
	    char operator =reader.next().charAt(0);
	    double result = 0 ;
	    switch (operator) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;

		default:
			System.out.println("Please pass the correct operator");
			break;
		}
	       System.out.println(result);
	
	
	
	
	}

}

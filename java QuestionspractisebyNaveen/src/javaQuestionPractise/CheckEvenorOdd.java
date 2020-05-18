package javaQuestionPractise;

import java.util.Scanner;

public class CheckEvenorOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers");
		 int a=sc.nextInt();
		if(a%2==0){
			System.out.println("the number "+a+" is even");
		}
		else
		{
			System.out.println("the number "+a+" is odd");
		}
	}

}

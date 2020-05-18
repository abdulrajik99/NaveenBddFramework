package javaQuestionPractise;

import java.util.Scanner;

public class Positive0rNegative 
{

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println(n+" is positive number");
		}
		else if(n<0){
			System.out.println(n+" is negative number");
	
		
		}
		else
		{
			System.out.println(n+" is zero");
		}
	}
}

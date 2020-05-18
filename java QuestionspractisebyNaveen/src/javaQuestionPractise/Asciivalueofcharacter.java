package javaQuestionPractise;

import java.util.Scanner;

public class Asciivalueofcharacter
{

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character ");
		char c=sc.next().charAt(0);
		int asc=c;
		System.out.println("The ascii value is "+asc);
	    
	}
}

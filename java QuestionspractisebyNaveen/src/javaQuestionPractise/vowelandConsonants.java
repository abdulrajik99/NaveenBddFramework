package javaQuestionPractise;

import java.util.Scanner;

public class vowelandConsonants {

	public static void main(String[] args)
	{

		//a e i o u 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character ");
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println(c+" is vowel   ");
		}
		else{
			System.out.println(c+"is constant  ");
		}
	
		//USING switch case
		switch(c){
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'I':
		case 'i':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(c+" is vowel   ");
			break;
			default:
				System.out.println(c+" is consonant   ");
		}
		
		
	}

}

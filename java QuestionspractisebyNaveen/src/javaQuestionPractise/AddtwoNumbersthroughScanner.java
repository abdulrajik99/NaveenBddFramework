package javaQuestionPractise;

import java.math.BigInteger;
import java.util.Scanner;

public class AddtwoNumbersthroughScanner {

	public static void main(String[] args) {

		String s1,s2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first Numbers ");
		 s1=sc.nextLine();
		System.out.println("Enter second Numbers ");
		 s2=sc.nextLine();
		 
		 BigInteger b1=new BigInteger(s1);
		 BigInteger b2=new BigInteger(s2);
		 BigInteger sum;
		 sum=b1.add(b2);
		
		System.out.println("The sum is "+sum);
		
	}

}

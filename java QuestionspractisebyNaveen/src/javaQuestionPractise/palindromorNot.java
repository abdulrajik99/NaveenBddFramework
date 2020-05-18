package javaQuestionPractise;

public class palindromorNot
{

	public static void main(String[] args)
	{
		int n=121;
		int dup=n;
		int rev=0;
		int rem=0;
		System.out.println("number is ="+n);
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse  is ="+rev);
		
		if(rev==dup)
			System.out.println(rev+" number is palindrome");
		else
			System.out.println(rev+" number is not palindrome");
	}

}

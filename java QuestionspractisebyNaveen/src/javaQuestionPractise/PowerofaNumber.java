package javaQuestionPractise;

public class PowerofaNumber 
{
	public static void main(String[] args){
		//2^3=8
		int base=2;
		int exponent=3;
		int e=exponent;
		int result=1;
		while(exponent!=0){
			result*=base;
			--exponent;
		}
		System.out.println(base+" ^"+e+" ="+result);
	}
}

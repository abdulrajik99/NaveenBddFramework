package javaQuestionPractise;

public class SumofnumbersUsingRecursion {
	
	public static int addNumbers(int num){
		if(num!=0)
			return num + addNumbers(num-1);
		else
		
		return num;
		
	}

	public static void main(String[] args) {
      int number=3;
      int sum=addNumbers(number);
      System.out.println("the sum is "+sum);
	}

}

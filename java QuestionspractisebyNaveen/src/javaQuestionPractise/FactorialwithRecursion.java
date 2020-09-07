/**
 * 
 */
package javaQuestionPractise;

/**
 * @author Abdul Rajik shaik
 *
 */
public class FactorialwithRecursion {

	/**
	 * @param args
	 * 
	 */
	public static int fact(int num){
		if(num>=1){
			return num*fact(num-1);
			
		}
		else
		{
			return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total=fact(5);
		System.out.println("the total is "+total);
	}

}

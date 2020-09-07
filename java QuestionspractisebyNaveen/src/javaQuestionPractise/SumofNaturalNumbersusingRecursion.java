/**
 * 
 */
package javaQuestionPractise;

/**
 * @author Abdul Rajik shaik
 *
 */
public class SumofNaturalNumbersusingRecursion {

	/**
	 * @param args
	 */
	public static int addNum(int num){
		if(num!=0){
			return num+addNum(num-1);
		}
		else{
			return num;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=15;
		int sum=addNum(n);
		System.out.println("the sum of numbers is "+sum);
	}

}

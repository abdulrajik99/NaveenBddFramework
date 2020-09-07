/**
 * 
 */
package javaQuestionPractise;

/**
 * @author Abdul Rajik shaik
 *
 */
public class DecimaltoBinary {

	/**
	 * @param args
	 */
	
	public static long convertDecimaltoBinary(int n)
	{
		long binaryNumber=0;
		int remainder=1,i=1;
		while(n!=0){
			remainder=n%2;
			n=n/2;
			binaryNumber+=remainder*i;
			i*=10;
		}
		return binaryNumber;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

//		System.out.println("Binary representation of 124: ");
//    	System.out.println(Integer.toBinaryString(124));
//        System.out.println("\nBinary representation of 45: ");
//        System.out.println(Integer.toBinaryString(45));
//        System.out.println("\nBinary representation of 999: ");
//        System.out.println(Integer.toBinaryString(999));
       int n1=156;
		long binary=convertDecimaltoBinary(n1);
		System.out.println("binary of "+n1+" =  "+binary);
	}

}

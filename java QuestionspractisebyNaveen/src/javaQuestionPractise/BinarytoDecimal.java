/**
 * 
 */
package javaQuestionPractise;

/**
 * @author Abdul Rajik shaik
 *
 */
public class BinarytoDecimal {

	/**
	 * decimal number =155 
	 * its binary  tranform is 10011011
	 * 
	 * 1       0   0   1   1   0   1   1  -> input
	 * 128            16  8   0    2   1
	 * 
	 * 128+16+8+2+1  =155
	 *   155 -> output  
	 */
	public static int convertBinaryToDecimal(long num){
		int decimalNumber=0,i=0; 
		while(num!=0)
		{
			long rem=num%10;
			num=num/10;
			decimalNumber += rem*Math.pow(2, i); 
//			System.out.println("before ++i value is  i  = "+i);
			++i;
//			System.out.println("after ++i   i  = "+i);
//			System.out.println("decimalNumber value =  "+decimalNumber);

		}
		return decimalNumber;
	}
	public static void main(String[] args) {

		long n=10011011;
		int deci=convertBinaryToDecimal(n);
		System.out.println("the decimal num is   =  "+deci);
	}

}

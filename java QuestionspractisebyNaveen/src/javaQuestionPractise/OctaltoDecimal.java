/**
 * 
 */
package javaQuestionPractise;

/**
 * @author Abdul Rajik shaik
 *
 */
public class OctaltoDecimal {

	/**
	 * @param args
	 */
	public static int convertOctaltoDecimal(int octal){
		int decimalNumber=0,i=0;
		while(octal!=0){
			decimalNumber+=(octal%10)*Math.pow(8, i);
			++i;
			octal/=10;
			
		}
		
		return decimalNumber;
	}
	public static void main(String[] args) 
	{
    
		System.out.println("Decimal number is  = "+convertOctaltoDecimal(116));
      
	}

}

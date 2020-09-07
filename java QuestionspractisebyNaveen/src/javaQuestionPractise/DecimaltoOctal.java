/**
 * 
 */
package javaQuestionPractise;

/**
 * @author Abdul Rajik shaik
 *
 */
public class DecimaltoOctal {

	/**
	 * @param args
	 */
	public static int convertDecimaltoOctal(int n)
	{
		
		int octalNumber=0,i=1;
		while(n!=0){
			octalNumber+=(n%8)*i;
			n/=8;
			i*=10;
		}
//		System.out.println("on"+octalNumber); 
		return octalNumber;
	}
	public static void main(String[] args) {

		int s=78;
		System.out.println(convertDecimaltoOctal(78));
//		int result=convertDecimaltoOctal(s);
//		System.out.println( " n = "+s+" in octal is = "+result);
	}

}

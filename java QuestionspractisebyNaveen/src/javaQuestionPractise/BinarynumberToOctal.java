package javaQuestionPractise;

public class BinarynumberToOctal {
	
//	binary number is always in 1's and 0's
	 public static int binary_to_octal( int binary)//11001
	    {
	        int octal = 0, decimal = 0, i = 0;

	        while(binary != 0)
	        {
	            decimal += (binary%10) * Math.pow(2,i);
	            ++i;
	            binary/=10;
	        }

	        i = 1;

	        while (decimal != 0)
	        {
	            octal += (decimal % 8) * i;
	            decimal /= 8;
	            i *= 10;
	        }

	        return octal;
	    }


	public static void main(String[] args) {

		int binary = 11001;
        System.out.println("the octal number of "+binary+" is =  "+binary_to_octal(binary));
	}

}

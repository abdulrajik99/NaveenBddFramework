package javaClassNotes;

public class java3VariablesAndMethods {

	//execution priority --> class variables , static blocks , main method 
	// for class variables memory is allocated when class is loaded.
	//method area - class variables are stored in  method area 
	//heap area   - instance variables are stored , memory is allocated at run time when object is created
	//stack area  - for local variables memory is stored here
	//native stack area - 
	//program counters   -
	
	int c=8 ,d= 10; //c d are instance variable
static int e =20 ,f =30;    //e , f class variable


	public static void main(String args[])
	{
//		local variables cannot be static
		java3VariablesAndMethods ob= new java3VariablesAndMethods();
		java3VariablesAndMethods ob2= new java3VariablesAndMethods();
		//new is dynamic memory allocation operator , it allocate memory to instance variables at run time
		// constructor constructs the object 
		int a= 10,b=9;
		ob2.c= ob2.c+3;
		java3VariablesAndMethods.e = java3VariablesAndMethods.e+20;
		System.out.println("e  = "+java3VariablesAndMethods.e);
		System.out.println(ob2.c); 
		System.out.println(new java3VariablesAndMethods().c );
		System.out.println("a ="+a+" b = "+b+" c = "+ob.c+" d = "+ob.d+" e = "+java3VariablesAndMethods.e+" f = "+java3VariablesAndMethods.f);
	}
}

package javaClassNotes;

public class java4DifferenttypesOfPrintingVariables {

	static int y=100;
	public void m1(){
		System.out.println(this.y);
	}
	static int x=10;
	public static void main(String[] args) {
		int x=20 ,y=50;
		System.out.println(x);
		java4DifferenttypesOfPrintingVariables ob= new java4DifferenttypesOfPrintingVariables();
		ob.m1();
		System.out.println(y);
	}

}

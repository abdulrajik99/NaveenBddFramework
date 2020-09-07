package javaClassNotes;

public class j5garbageCollectors {

	int x=10,y=20;//instance variable 
	static int a=50; // class variable
	{
		int i=1;
		System.out.println(i);
	}
	public void m(int d) //method parameter
	{
		System.out.println(d);
	}
	public static void main(String[] args) {
//		garbage collectors means unused objects
		int g=98; // local variable
		
		j5garbageCollectors d1= new j5garbageCollectors();
		j5garbageCollectors d2= new j5garbageCollectors();
		j5garbageCollectors d3= new j5garbageCollectors();
	     System.out.println(d1.x);
	     System.out.println(d1.y);
	     System.out.println(d2.x);
	     System.out.println(d2.y);
	     System.out.println(d3.x);
	     System.out.println(d3.y);
	     d1=null;
	     System.out.println(d1);
	
	}

}

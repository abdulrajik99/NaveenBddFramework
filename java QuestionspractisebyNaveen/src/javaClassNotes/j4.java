package javaClassNotes;

public class j4 {

	int x=10;
	static int y=20;
//	every person has his notebook (NON -STATIC), but in a class we have only one board(STATIC)
//	if we change on board 
	public static void main(String[] args) {

		int a=90;
		j4 ob = new j4();
		j4 ob2 = new j4();
		ob.x = ob.x + 2;
		ob.y = ob.y + 2;
		System.out.println(ob.x);
		System.out.println(ob.y);
		System.out.println(ob2.x);
		System.out.println(ob2.y);
		System.out.println(a);
	}

}

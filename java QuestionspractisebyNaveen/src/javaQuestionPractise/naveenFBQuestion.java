package javaQuestionPractise;

import java.util.ArrayList;

public class naveenFBQuestion {

	public static void main(String[] args) {
// identify on
		ArrayList<ArrayList<Integer>> aList=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		aList.add(a1);
		
		ArrayList<Integer> a2=new ArrayList<>();
        a2.add(5);
        aList.add(a2);
        System.out.println(aList);
        
//        identity on
        ArrayList<ArrayList<Integer>> bList=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> b1=new ArrayList<>();
		b1.add(100);
		b1.add(200);
        bList.add(b1);
        System.out.println("before clean "+bList);
        b1.clear();
        System.out.println("b1  is clear"+b1);
        b1.add(500);
        b1.add(600);
        System.out.println("b1 ="+b1);
        bList.add(b1);
        System.out.println("blist ="+bList);
        
//        identity on c 
        ArrayList<ArrayList<Integer>> cList=new ArrayList<ArrayList<Integer>>();
     		ArrayList<Integer> c1=new ArrayList<>();
        c1.add(150);
        c1.add(300);
        cList.add(c1);
        System.out.println("before c1 =new arraylist  "+cList);
        c1=new ArrayList<>();
        c1.add(5000000);
        cList.add(c1);
        System.out.println(cList);

	}

}

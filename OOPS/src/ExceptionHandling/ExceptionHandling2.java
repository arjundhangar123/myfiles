package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("****program starts****");
		//1.  abnormal statement
		Scanner scn=new Scanner(System.in);
		System.out.println("enter array size");
		int size=scn.nextInt();
		int[]empids=new int[size];
		try {
			System.out.println(empids[3]);
			//Arrayindexoutofbondsexception
		}catch(ArrayIndexOutOfBoundsException  g) {
			System.out.println("Exception handle:"+g);
		}
		System.out.println("***program ends***");
	}

}

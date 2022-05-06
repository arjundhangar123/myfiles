package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("****program starts****");
		//abnormal statement
		int i,j,k;
		Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter first num1:");
		i=sc.nextInt();
		System.out.println("Enter second num2:");
		j=sc.nextInt();
		k=i/j;  //Arithematic Exception
		System.out.println("result:"+k);
	}catch(ArithmeticException e) {
		System.out.println("Exception handled:"+e);
		//e.printStackTrace();
	}
		System.out.println("program ends");

	}

}

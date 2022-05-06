package Scannerinputconsole;   // console output type

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
//		int age = 10;
//		double salary = 2566.36;
//		String name = "pune";
		
		     // obj creation of scanner
		
		Scanner gg = new Scanner(System.in);
		int age ;
		double salary ;
		String name ;
		boolean invalid;
		int num1,num2;
		
		char op;
		//initialization of variable using scanner
		
		System.out.println("get age value of console");
		age = gg.nextInt();
		System.out.println("get salary value of console");
		salary = gg.nextDouble();
		System.out.println("get name value of console");
		name = gg.next();
		System.out.println("Enter true or false value of console");
		invalid=gg.nextBoolean();
//		System.out.println("age: "+age);
//		System.out.println("salary: "+salary);
//		System.out.println("name: "+name);
//		System.out.println("valid: "+invalid);

		System.out.println("get num1 value of console");
		num1=gg.nextInt();
		System.out.println("get num2 value of console");
		num2=gg.nextInt();
		System.out.println("get op value of console");
		op=gg.next().charAt(0);
		System.out.println("************************");
		System.out.println("Addition of two numbers: "+addNumber(op,num1, num2));
	}

	private static String addNumber(char op, int num1, int num2) {
		// TODO Auto-generated method stub
		return null;
	}

	
		
	}



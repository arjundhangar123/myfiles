package Strings;    //for loop using reverse word imp

import java.util.Scanner;

public class StringClasss2 {

	public static void main(String[] args) {
		String str="DhanoriPune";
		String temp="";
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));//dhanoripune			
		}
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);//dhanoripune
		}
		System.out.println("str:"+str);
		System.out.println("temp:"+temp);
		System.out.println(reversestring("DhanoriPune"));
		String s1="Bangalore";
	//	System.out.println(reverseString(s1));
//		
//		Scanner scn=new Scanner(System.in);
//		String s2;
//		System.out.println("Enter String to be reverse: ");
//		s2=scn.next();
//		System.out.println("Reverse String is: "+ReverseString(s2));
		
//     System.out.println(palinString("abcd"));
//		Scanner scn=new Scanner(System.in);
//		String s2;
//		System.out.println("Enter string to check for palindrome");
//		s2=scn.next();
//		palinString(s2);
//		String s2;
//		System.out.println("Enter String to be reverse: ");
//		s2=scn.next();
//		System.out.println("Reverse String is: "+reverseString(s2));
		
		//System.out.println(palinString("abcd"));
//		Scanner scn=new Scanner(System.in);
//		String s2;
//		System.out.println("Enter string to check for palindrome");
//		s2=scn.next();
//		palinString(s2);
	}
		 
	 static String reversestring(String str) {
			String temp="";
			for (int i=str.length()-1;i>=0;i--) {
				temp=temp+str.charAt(i);
			}
			return temp;
		}
	 static void palinString(String str) {
			String s1=str;
			String temp="";
			for(int i=str.length()-1;i>=0;i--) {
				temp=temp+str.charAt(i);
			}
			if(temp.equals(s1)) {
				System.out.println("Given string is a palindrome..."+str);
			}else {
				System.out.println("Given string is not a palindrome..."+str);
			}
		}
	}




package Strings;

public class timepass {

	

	public static void main(String[] args) {
		
		String s1="arjun";
		String temp=" ";
		for (int i=s1.length()-1;i>=0;i--) {
	   temp = temp+s1.charAt(i);
		
		}
		System.out.println(s1);
		System.out.println(temp);
	}

}

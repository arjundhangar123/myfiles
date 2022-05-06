package Strings;

public class StringClasss3 {

	private static final String Str = null;

	public static void main(String[] args) {
		String s1="I am from up";
		System.out.println("Actual Sting: "+s1);
		String[] Strary=s1.split(" ");
		for (String s:Strary) {
		System.out.println(s);}
		System.out.println("**********************");
		
		String s2="I am from up";
		System.out.println("Actual String :"+s2);
		String[] Strary2=s2.split(" ", 3);
		for (String s:Strary2) {
			System.out.println(s);
			}
		System.out.println("**********************");
		
		String s3="I am from pune";
		System.out.println("actual string:"+s3);
		String str[] =s3.split(" ");
		String temp=" ";
	//	for (String s:Strary3) {
	//		System.out.println(s);
	//	}
		for (int i=str.length-1;i>=0;i--) {//reverse statement= pune from am I
			temp=temp+" "+str[i];
		}
		System.out.println("reverse statement:"+temp);
		
		String s4="     I am from up      ";
		System.out.println("actual string with space:"+s4);
		System.out.println("actual string length:"+s4.length());
		//count char 0 se start
		System.out.println("actual string without spaces:"+s4.trim());
		//space nikale show words
		System.out.println("actual string length without space:"+s4.trim().length());
		//space nikalke length count
		System.out.println("*******************************");
		
		String s5="I     am       ARJUN";
		System.out.println("actual string with space:"+s5);
		System.out.println("actual string count:"+s5.length());
		System.out.println("actual string without space:"+s5.trim().length());
		//under spaces not count
		
	}

}

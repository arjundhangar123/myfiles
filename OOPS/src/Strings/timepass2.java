package Strings;

public class timepass2 {

	public static void main(String[] args) {
		String s1=" I am arjun ";
		System.out.println(s1);           //actual string
		System.out.println(s1.length());   // count charectors
		System.out.println(s1.trim());     // count spaces or show words
		System.out.println(s1.indexOf("am")); // am words 3 no. pe
		System.out.println(s1.concat(s1));   // join two words
		System.out.println(s1.equalsIgnoreCase("am"));//false  upper case ignore
		System.out.println(s1.replace("arjun", "abhay"));// i am abhay
		System.out.println(s1.join("arjun", "kartik"));//kartik
       System.out.println(s1.toString());//obj seen  representation an obj
       System.out.println(s1.toUpperCase());//REPRESENT CAPITAL LETTER
       System.out.println(s1.startsWith("am"));//starts kahase ho rha he
       System.out.println(s1.substring(3));//3 space chodke
       System.out.println(s1.charAt(7));//7 no.ke baad kya ayega char
       
       String s2= "mumbai";
       String s3= "pune";
       System.out.println(s2.concat(s3));// mumbai pune      words joined
	}

}

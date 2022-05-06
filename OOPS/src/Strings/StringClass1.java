package Strings;

public class StringClass1 {

	public static void main(String[] args) {
		StringClass1 c1=new StringClass1();
		
		System.out.println("c1:"+c1);
		
		String s1= "Mumbai";
		String s2= "Mumbai";
		String s3= "Banglore";
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		
		System.out.println("s1 char amount with:"+s1.length());//word mumbai kiti 6
		System.out.println("s2 char amount with:"+s2.length());
		System.out.println("s3 char amount with:"+s3.length());//banglore 8
		
		System.out.println("s1&s2 using equals():"+s1.equals(s2));
		System.out.println("s1&s2 using '==':"+(s1==s2));//mumbai==mumbai  : true
		
		System.out.println("s1&s2 using equals():"+s1.equals(s3));
		System.out.println("s1&s2 using '==':"+(s1==s3));//mumbai==banglore :false
		
		String s4=new String("Mumbai");
		System.out.println("s4:"+s4);  //mumbai
		System.out.println("s4 char amount with:"+s4.length());//count charectors
		System.out.println("s1&s4 using equals():"+s1.equals(s4));//true
		System.out.println("s1&s4 using'==':"+(s1==s4));//false
		String s5=new String("Mumbai");
		System.out.println("s5:"+s5);
		System.out.println("s5 char amount with:"+s5.length());
		System.out.println("s1&s5 using equal():"+s4.equals(s5));
		System.out.println("s1&s5 using '==':"+(s4==s5));
		//compare add basis false ie obj new keyword
		String s6=new String("Hyderabad");
		System.out.println("s6:"+s6);
		System.out.println("s6 char amount with:"+s6.length());
		System.out.println("s1&s6 using equal with:"+s1.equals(s6));
		System.out.println("s1&s6 using'==':"+(s5==s6));


		
	}

}

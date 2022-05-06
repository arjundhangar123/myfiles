package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("****program starts****");
		//1. abnormal statement
		int i=10/0;
		int j=i/0;    //arithematic exception 
		System.out.println("result:"+j);
		
		//2. abnormal statement
		int[] empids=new int[3];
		empids[3]=101;  //Array index out of bounds exception
		
		//3.abnormal statement
		String str=null;
		System.out.println(str.length());//null pointer exception
		
		//4 abnormal statement
		String s="abc";
		int num =Integer.parseInt(s);
		System.out.println("num:"+num);//no. format exception
		System.out.println("****end program****");
		
		
		
	}

}

package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling94 {
	// defining a method
   public static int dividenum (int m,int n)throws ArithmeticException{
	   int div=m/n;
	return div;
	   
   }
	public static void main(String[] args)throws FileNotFoundException { 
		ExceptionHandling94 obj=new ExceptionHandling94();
		try {
			System.out.println(obj.dividenum(5, 0));
		}catch(ArithmeticException e) {
			System.out.println("/n number not divide by zero");
		}
		FileInputStream fis=new FileInputStream("FileLocation");
    System.out.println("rest of the code");
	}

}

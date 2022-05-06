package ExceptionHandling;

public class ExceptionHandling8 {

	public static void main(String[] args) {
		try {
			System.out.println("inside try block");
			//code throw divide by zero exeption
			int data =25/0;
			System.out.println(data);
	}// handle arrithematic exception//divide by zero exception
     catch(ArithmeticException  e) {
    	 System.out.println("handle exception");
    	 System.out.println(e);
     }finally {
    	 System.out.println("finally block always excute");
     }
		System.out.println("rest of code");
	}

}

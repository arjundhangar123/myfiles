package ExceptionHandling;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		//below code do not throw any Exception
		try {
			int data=30/0;
			System.out.println(data);
		}// catch won't be executed
		catch(ArithmeticException e) {
			System.out.println("Exception handle");
		}// executed regardless of exception occurred or not

		finally {
			System.out.println("finally block is always executed");
		}
        System.out.println("the rest of code");
	}

}

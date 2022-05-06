package ExceptionHandling;

public class ExceptionHandling95 {
	static void method()throws ArithmeticException{
		System.out.println("inside method");
		throw new ArithmeticException("throwing arithmetic exception");
	}

	public static void main(String[] args) {
		try {
			method();
		}catch(ArithmeticException e) {
			System.out.println("caught in main method");
		}
		
	}

}

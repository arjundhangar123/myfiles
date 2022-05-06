package ExceptionHandling;

public class ExceptionHandling6 {

	public static void main(String[] args) {
		try {
			System.out.println("inside of the try block");
			//below code throw divide by zero Exception
			int data=25/0;
			System.out.println(data);
		}
		// cannot handle Arithmetic type exception
		// can only accept Null Pointer type exception
		catch(NullPointerException e) {
			System.out.println(e);
		}finally {
			System.out.println("i am finally block always excute ");
		}
		 //finally block always execute
		 //do not handle finally block
		 //finally block declared then program terminated
	}

}

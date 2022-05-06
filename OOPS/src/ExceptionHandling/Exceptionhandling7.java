package ExceptionHandling;

public class Exceptionhandling7 {

	public static void main(String[] args) {
		try {
			System.out.println(" inside of the try block");
			//code throw divide by zero Exception
			int data=25/0;
			System.out.println(data);
		}// cannot handle Arithmetic type exception
		// can only accept Null Pointer type exception
        catch(NullPointerException e) {
        	System.out.println(e);
        }finally {
        	System.out.println("i m inside of block ");
        	int k=10/0;
        	System.out.println("finally block always excuted");
        	
        }
		System.out.println("rest of code");
	}

}

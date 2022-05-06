package ExceptionHandling;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		System.out.println("***program starts****");
		try {
			int []a=new int[3];
			a[3]=30/0;
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsExceptionoccurs");
		}catch(Exception e) {
			System.out.println("exception handleoccurs");
		}try {
			int []a=new int [5];
			a[5]=50/2;
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(Exception e) {
			System.out.println("exception");
		}
        System.out.println("code may be rest");
	}  
	}
/**
* try block can have multiple catch block, but only one catch block will be executed 
* try can handle only one abnormal condition at a time
*/
		

	
	



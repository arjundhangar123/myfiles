package ExceptionHandling;

public class ExceptionHandling9 {
	public static void validateage(int age) {
		if(age<18) {
			//throw Exception if not eligiable to vote
			throw new ArithmeticException("if person not eligiable for vote");
		}else {
			System.out.println("person are eligiable for vote");
		}
	}

	public static void main(String[] args) {
		//calling the function
		//invalid age(13)//without handling the exception
		try {
			validateage(19);
		}catch(ArithmeticException  e) {
			System.out.println("Exception handle");
			System.out.println(e);
		}
		System.out.println("rest of code");
	}

}

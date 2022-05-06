package ExceptionHandling;

public class ExceptionHandling91 {
     public static void validage(int age) {
    	 if (age<18) {
    		 throw new ArithmeticException("person not eligiable");
    	 }else {
    		 System.out.println("person are eligiable");
    	 }
     }
	
     
	public static void main(String[] args) {
		try {
			validage(13);
		}catch(ArithmeticException  e) {
			System.out.println("exception handled");
			System.out.println(e);
		}
		System.out.println("rest of code");
	}

}

package ExceptionHandling;

public class ExceptionHandling93 {

	public static void main(String[] args)throws InterruptedException,
	UserDefinedException {
		System.out.println("program starts");
		SetSleep(5000);
		Checknumber(0);
		System.out.println("Hello geeks");
		//throw syso writing  ie unchecked
		//trows method writing
	}
	 
	static void SetSleep(long time)throws InterruptedException {
		Thread.sleep(time);
		
	}
     static void Checknumber(int num)throws UserDefinedException {
		if (num<0) {
			throw new UserDefinedException("number less dn zero");
		}else {
			System.out.println("number is:"+num);
		}
		
	}
}

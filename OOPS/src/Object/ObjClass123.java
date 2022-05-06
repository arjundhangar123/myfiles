package Object;
class Demo{
	void display() {
		System.out.println("I am display()..");
	}
}
public class ObjClass123 extends Demo{

	static int last_roll = 100;
	int roll_no;

	// Constructor
	ObjClass123()
    {
        roll_no = last_roll;
        last_roll++;
    }

	// Driver code
	public static void main(String args[]) {
		ObjClass123 s = new ObjClass123();

		// Below two statements are equivalent
		System.out.println(s);//s.toString() -->string representation of an object
		System.out.println(s.toString());//string representation of an object
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());		
		Demo d2=new ObjClass123();
		System.out.println(d2);
	}

}



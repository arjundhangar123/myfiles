package Wrapperclass;

public class Boxingoperation2 {

	public static void main(String[] args) {
		Double doubleobj=250.033;
		System.out.println(doubleobj);
		//only boxed object can be unboxed
	
		Double salary=doubleobj.doubleValue();
		System.out.println(salary==doubleobj);
		System.out.println(salary);

	}

}

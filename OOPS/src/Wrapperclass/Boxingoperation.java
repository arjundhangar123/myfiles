package Wrapperclass;

public class Boxingoperation {

	public static void main(String[] args) {
		int age=30;
		System.out.println("Age:"+age);
		
		Integer intobj1=new Integer(age);//explicit boxing operation
		System.out.println("intobj1:"+intobj1);
		System.out.println(age==intobj1);//compare value

		Integer intobj2=new Integer(50);//explicit boxing operation
		System.out.println("intobj2:"+intobj2);
		
		Integer intobj3=30;//implicit boxing operation
		System.out.println(intobj3);
	}

}

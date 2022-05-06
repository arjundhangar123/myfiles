package Wrapperclass;

public class Boxingoperation1 {

	public static void main(String[] args) {
		char c1='A';
		Character obj1=new Character(c1);//boxing
		System.out.println(c1==obj1);
		System.out.println(c1);
		
		Character obj2=new Character('z');
		Character obj3='h';               //boxing
		System.out.println("obj2:"+obj2);
		System.out.println("obj3:"+obj3);
		
		boolean b=true;
		Boolean cb=new Boolean(b);
		System.out.println(cb==b);
	}

} /*def   wraper class
* converting primitivetypes  into datatypes
*
*/

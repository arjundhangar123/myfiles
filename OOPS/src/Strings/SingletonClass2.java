package Strings;
 class Demo1223{
 private Demo1223() {
	System.out.println("I am zero param");
  }
 static Demo1223 d1= new Demo1223();
 String name="pune";
 static Demo1223 getinstance() {
	 return d1;
 }
 void print() {
	 System.out.println(" I am print() of singlrton class Demo1223");
 }
 }
public class SingletonClass2 {

	public static void main(String[] args) {
		//Demo1223 d1=new Demo1223();
		//compile time error due to singleton concept
		//or
		Demo1223 d1=Demo1223.getinstance();
        d1.print();
		System.out.println(d1.name);
		d1.name="banglore";
		System.out.println("d1ref:"+d1.name);
		Demo1223 d2=Demo1223.getinstance();
		System.out.println("d2ref:"+d2.name);

	}

}

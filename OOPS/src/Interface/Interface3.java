package Interface;
interface Printable {
	int age=30;//by default public static final//we can't modified vapru nhi shakat
	void print();//abstract method by default abstract method no implemention
}
interface Showable {
	void show();//abstract method by default abstract method no implemention

}
class Interface3 implements Printable, Showable {
	public void print() {
		System.out.println("Hello, print");
	}
	public void show() {
		System.out.println("Welcome, show");
	}
	public static void main(String args[]) {
		Interface3 obj = new Interface3();
		obj.print();
		obj.show();
		System.out.println(Printable.age);
	}
}
// class to class extends 
//interface to interface extends
//class to interface ie implements

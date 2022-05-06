package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ArrayListExample4 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		System.out.println("arraylist is empty:"+a1.isEmpty());
		a1.add("Ravi");
		a1.add("Vijay");
		a1.add("Ajay");
		a1.add("Hanumant");
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Ravi");
		a2.add("hanumant");
		a2.add("pune");
		System.out.println("a1 list of elements:"+a1);
		System.out.println("a2 list of elements:"+a2);
		
		a1.retainAll(a2);//same elements remove hoil ie Ravi
		System.out.println("a1 list after retail all:"+a1);
		System.out.println("iterating the elements after retaining the elements of a2");
		
		Iterator itr = a1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		List l1=new ArrayList();
		l1.add("pune");
		l1.add("pune");
		l1.add(123);
		l1.add("pune");
		l1.add(null);
		System.out.println(l1);
		
	}

}

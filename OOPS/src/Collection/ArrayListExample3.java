package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class ArrayListExample3 {

	public static void main(String[] args) {
		/*ArrayList<Integer>l1=new ArrayList<Integer>();
		*l1.add(12);
		*ArrayList<Boolean>l2=newArrayList<Boolean>();
		*l2.add(true);
		*ArrayList <charecters>l3=ArrayList<charecter>();
		*l3.add("c");
		*/
	   ArrayList<String> l4 = new ArrayList<String>();
        l4.add("Ravi");
		l4.add("Vijay");
		l4.add("Ajay");
		l4.add("Anuj");
		l4.add("Gaurav");
		System.out.println("list of elements:"+l4);
		//removing specific elements
		System.out.println("remove elements of collection:"+l4.remove("Vijay"));
		System.out.println("after invoking remove (obj method):"+l4);
		//removing elements  on the basis of specific position
		System.out.println("remove index 0 from collection:"+l4.remove(0));
		System.out.println("after invoking remove (index)method:"+l4);
		System.out.println("*********************");
		//creating another arraylist
		ArrayList<String>a2=new ArrayList<String>();
		a2.add("Ravi");
		a2.add("Hanumat");
		l4.addAll(a2);    //a2.addAll(l4);
		System.out.println("updated arraylist:"+a2);
		//removing all the elements from arraylist
		l4.removeAll(a2);   //a2.addAll(l4);
		System.out.println("after invoking remove all method:"+a2);
		//removing elements on the basis sp cond.
		l4.removeIf(Str->Str.contains ("Ajay"));
		//removing all the elements available in the list
		l4.clear();
		System.out.println("after invoking clear()method:"+l4);
		
		

	}

}

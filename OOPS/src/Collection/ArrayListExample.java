package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListExample {
  public static void main(String[] args) {
		
		//creating Arraylist and Adding elements
		ArrayList list=new ArrayList();
		

		list.add("mango");   //auto-upcasting from String to Object class object
        list.add(1235);      //first boxing to Integer class object---> upcasting to object class
		list.add("Banana");  //               to boolean class
		list.add(null);
		list.add("c");           //     to charecter class
		list.add(15.26);          //     to double
		list.add("True");         //      to boolean
		list.add("new array list example"); 
		
		//printing all element
		System.out.println("size of list:"+list.size());
		System.out.println("element of list:"+list);
		System.out.println("traversing list through for each loop");
		
		//traversing elements ie stored elements
		
		for (Object fruit: list) {   //ref variable fruit
		System.out.println(fruit);
		}
		
		//accesing 
		System.out.println("returning the element:"+list.get(1));
		System.out.println(list.set(1,"dates"));
		System.out.println("size of list:"+list.size());
		System.out.println("element of list:"+list);
		

	}
	
}

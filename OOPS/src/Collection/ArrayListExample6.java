package Collection;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListExample6 {

	

	public static void main(String[] args) {
		//Generic: with the help of generic we can force collection ......
		//to store similar type of data
		
		ArrayList<Integer>m1=new ArrayList<Integer>();
		
		m1.add(12);
		m1.add(10);
		m1.add(2);
		m1.add(15);
		m1.add(18);
		System.out.println("Size:"+m1.size());
		System.out.println("Element of collection:"+m1);
		Collections.sort(m1);
		System.out.println("after collection sort:"+m1);//low to high
		Collections.reverse(m1);
		System.out.println("after collections reverse:"+m1);//high to low
		

	}

}

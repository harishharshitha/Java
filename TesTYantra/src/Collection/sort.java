// to sort the elements in the arraylist

package Collection;

import java.util.*;

public class sort {
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(1000);
		a.add(40);
		a.add(80);
		
		ArrayList a1=new ArrayList();
		a1.add("indu");
		a1.add("bharath");
		a1.add("Navi");
		
		
		System.out.println("Before sorting");
		System.out.println(a);
		System.out.println("****************");
		
		System.out.println("after sorting");
		Collections.sort(a);
		System.out.println(a);
		System.out.println("****************");
		
		//reversing an array
		System.out.println("Before reversing");
		System.out.println(a);
		System.out.println("****************");
		
		System.out.println("after reversing");
		Collections.reverse(a);
		System.out.println(a);
		System.out.println("****************");
		
		
		System.out.println("Before sorting");
		System.out.println(a1);
		System.out.println("****************");
		
		System.out.println("after sorting");
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println("****************");
		
		//reversing an array
		System.out.println("Before reversing");
		System.out.println(a1);
		System.out.println("****************");
		
		System.out.println("after reversing");
		Collections.reverse(a1);
		System.out.println(a1);
		System.out.println("****************");
		
		
		
		
		
	}

}

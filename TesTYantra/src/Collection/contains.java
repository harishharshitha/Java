package Collection;

import java.util.*;

public class contains {
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		
		ArrayList a1=new ArrayList();
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		a1.addAll(a);
		System.out.println(a1);
		
		Object a11=20;
		System.out.println("\n what is the index value of element 20:" +a1.indexOf(a11));
		System.out.println("\n does it contains element 20:" +a1.contains(a11));
		System.out.println("\n does a1 contains element in ls:" +a1.containsAll(a));
		a1.clear();
		System.out.println(a1);
		
	}

}

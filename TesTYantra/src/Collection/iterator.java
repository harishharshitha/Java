package Collection;

import java.util.*;

public class iterator {
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		
		ArrayList a1=new ArrayList();
		a1.add(50);
		a1.add(70);
		a1.add(80);
		a1.addAll(a);
		
		System.out.println(a1);
		
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}

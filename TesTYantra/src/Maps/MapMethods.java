package Maps;

import java.util.*;

public class MapMethods
{
	public static void main(String[] args)
	{
	TreeMap m=new TreeMap();
	m.put(1, "Hello Java");
	m.put(2,"Update");
	m.put(3, "to");
	m.put(4,"Version" );
	
	
		System.out.println(m);
		
		TreeMap m1=new TreeMap();
		m1.put(5, "Hello Java");
		m1.put(6,"Update");
		m1.put(7, "to");
		m1.put(8,"Version" );
		
		m1.putAll(m);
		System.out.println(m1);
		
		m1.get(2);
		System.out.println(m1);
		
		/*m1.containsKey(m);
		System.out.println(m1);*/
		m1.remove(5);
		System.out.println(m1);
		
		m1.clear();
		System.out.println(m1);
		
		
		if(m1.isEmpty())
		
			{
				System.out.println("empty");
			}
			else
			{
				System.out.println("not empty");
			}
		
		
		if(m.containsKey(2))
		{
			System.out.println("contains key");
		}
		else
		{
			System.out.println("doesnot contains key");
		}

		
		if(m.containsValue("Hello java"))
		{
			System.out.println("contains key");
		}
		else
		{
			System.out.println("doesnot contains key");
		}
		
		

}
}

package Maps;

import java.util.TreeMap;

public class Sample2 {
	public static void main(String[] args)
	{
		TreeMap<Integer,String> m=new TreeMap<>();
		m.put(1, "Hello Java");
		m.put(2,"Update");
		m.put(3, "to");
		m.put(4,"Version" );
		
		
			System.out.println(m);
			
			TreeMap<Integer,String> m1=new TreeMap<>();
			m1.put(5, "Hello Java");
			m1.put(6,"Update");
			m1.put(7, "to");
			m1.put(8,"Version" );
		
			m1.putAll(m);
			
			System.out.println(m1);
	}

}

package Maps;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
public class Sample {
	public static void main(String[] args)
	{
		HashMap h=new HashMap();
		h.put(1, "Hello Java");
		h.put(2, 60);
		h.put(3, 10);
		h.put(4, 140);
		
		System.out.println(h);
		
		HashMap h1=new HashMap();
		h1.put(1, "Update");
		h1.put(null, null);
		h1.put(5, 100);//key value should be unique else the new value will be updated(in h object (1,10)---(in h1 object (1,20) in c
		//console we get update value 1,20
		h1.put(6, 130);
		
		h1.putAll(h);
		System.out.println("*********************");
		System.out.println(h1);
		
		System.out.println("*********************");
		//only keys
		Set s=h.keySet();
		System.out.println(s);
		
		System.out.println("*********************");
		//only values
		Collection c=h.values();
		System.out.println(c);
		
		
	}

}

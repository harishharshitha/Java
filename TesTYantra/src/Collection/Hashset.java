package Collection;
import java.util.*;
public class Hashset {
	public static void main(String[] args)
	{
		HashSet h=new HashSet();
		h.add(20);
		h.add(10);
		h.add('a');
		System.out.println(h);
		
		HashSet h1=new HashSet();
		h1.add("java");
		h1.add(20);
		h1.add('a');
		
		System.out.println(h1);
		h1.addAll(h);
		System.out.println(h1);
		
		
		h1.removeAll(h);
		System.out.println(h1);
		
		h1.retainAll(h);
		System.out.println(h1);
		
		h1.clear();
		System.out.println(h1);
		
		
	}

}

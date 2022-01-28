package Collection;

import java.util.ArrayList;

public class set {
	public static void main(String[] args)
	{
		ArrayList <Object> s=new ArrayList<>();
		s.add(10);
		s.add(20);
		s.add(80);
		s.add(40);
		
		System.out.println(s);
		s.remove(1);
		System.out.println(s);
		
		ArrayList s1=new ArrayList();
		s1.add(90);
		s1.add(60);
		s1.add(80);
		
		s1.add(40);
		
		s1.addAll(s);
		System.out.println(s1);
		
		System.out.println("Contains");
		s1.contains(40);
		System.out.println(s1);
		
		System.out.println("Containsall");
		s1.containsAll(s);
		System.out.println(s1);
		
		System.out.println("retainAll");
		s1.retainAll(s);
		System.out.println(s1);
		
		
		
		System.out.println("removeAll");
		s1.removeAll(s);
		System.out.println(s1);
	}

}

package Collection;
import java.util.*;
public class D {
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		a.add(1,90);//index 
		a.add(1,"hello");
		System.out.println(a);
		
		ArrayList a1=new ArrayList();
		a1.add(40);
		a1.add("ball");
		a1.add('a');
		a1.add(a);//printing the reference of 'a ' obj with 'al' obj
		System.out.println(a1);
		a1.add(2,"java");
		a1.addAll(a);
		System.out.println(a1);
		
	}

}

package Collection;
import java.util.*;
public class iterator1 {
public static void main(String[] args)
{
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	a.add(60);
	
	System.out.println(a);
	
	ListIterator i=a.listIterator();
	while(i.hasNext())
	{
		System.out.println(i.next()+" ");
		i.remove();
	}
	System.out.println();
	
	while(i.hasPrevious())
	{
		System.out.println(i.previous()+" ");
		
	}
	
}
}

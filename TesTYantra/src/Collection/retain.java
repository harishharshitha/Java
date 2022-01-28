package Collection;

import java.util.ArrayList;

public class retain {

public static void main(String[] args)
{
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	
	
	ArrayList a1=new ArrayList();
	a1.add(40);
	a1.add(50);
	a1.add(60);
	
	System.out.println(a1);
	a1.retainAll(a);
	System.out.println(a1);
}
}

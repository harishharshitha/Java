package Collection;
import java.util.*;
import java.util.ArrayList;
public class Employee1 implements Comparable
{
	String name;
	double sal;
	
	Employee1(String name,double sal)
	{
		this.name=name;
		this.sal=sal;
	}

	public int compareTo(Object o)
	{
		Employee1 e=(Employee1)o;
		if(this.sal==e.sal)
			return 0;
		else if(this.sal>e.sal)
		return 1;
		else
			return -1;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(sal);
	}



public static void main(String[] args)
{
	ArrayList <Object> a=new ArrayList<>();
	a.add(new Employee1("abc",50000));
	a.add(new Employee1("xyz",10000));
	a.add(new Employee1("zyx",90000));
	
	//Collections.sort(a);
	System.out.println(a);
	
	Iterator i=a.iterator();
	while(i.hasNext())
	{
		((Employee1)i.next()).display();
	}
}
}


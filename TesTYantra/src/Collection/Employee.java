package Collection;
import java.util.*;
public class Employee implements Comparable
{
	String name;
	double sal;
	
	Employee(String name,double sal)
	{
		this.name=name;
		this.sal=sal;
	}

	public int compareTo(Object o)
	{
		Employee e=(Employee)o;
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
	ArrayList a=new ArrayList();
	a.add(new Employee("abc",50000));
	a.add(new Employee("xyz",10000));
	a.add(new Employee("zyx",90000));
	
	Collections.sort(a);
	System.out.println(a);
	
	for(Object o:a)
	{
		Employee e=(Employee)o;
		e.display();
	}
}
}


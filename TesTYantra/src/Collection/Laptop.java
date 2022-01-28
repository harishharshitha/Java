package Collection;
import java.util.*;
public class Laptop implements Comparable
{
	int id;
	double price;
	String RAM;
	
	Laptop(int id,double price,String RAM)
	{
		this.id=id;
		this.price=price;
		this.RAM=RAM;
	}
	
	public int compareTo(Object o)
	{
		Laptop l=(Laptop)o;
		if(this.price==l.price)
			return 0;
		else if(this.price>l.price)
		return 1;
		else
			return -1;
		
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(price);
		System.out.println(RAM);
	}
public static void main(String[] args)
{
	TreeSet t=new TreeSet();
	t.add(new Laptop(1,200000,"6GB"));
	t.add(new Laptop(2,1400000,"8GB"));
	t.add(new Laptop(3,70000,"64GB"));
	t.add(new Laptop(4,200000,"32GB"));
	for(Object o:t)
	{
		Laptop l=(Laptop)o;
		l.display();
	}
	
	
	
	
	
}

}

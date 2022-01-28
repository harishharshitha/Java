package Collection;
import java.util.*;
import java.util.ArrayList;
public class city {
	public static void main(String[] args)
	{
		ArrayList <Object> a=new ArrayList();
		a.add("Bengaluru");
		a.add("Mysore");
		a.add("Chennai");
		a.add("kolar");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the city name");
		Object str=sc.next().trim();
		
		if(a.contains(str))
		{
			System.out.println(a.remove(a.indexOf(str)));
			System.out.println(a);
		}
		else
		{
			System.out.println("city is not present");
		}
		
	}

}

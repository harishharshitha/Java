package Collection;
import java.util.*;
public class fruit {
	public static void main(String[] args)
	{
		ArrayList b=new ArrayList();
		b.add("Apple");
		b.add("Mango");
		b.add("Peach");
		b.add("grape");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fruit");
		Object str=sc.next().trim();
		
		
		if(b.contains(str))
		
			System.out.println("fruit is present");
		
		else
		
			System.out.println("fruit is not present");
		
	}

}

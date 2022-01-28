package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class fruits1
{
	public static void ai(String[] args)
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
	{
		System.out.println(b.indexOf(str));
	}
	else
	
		System.out.println("fruit is not present");
	
}

}

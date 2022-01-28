package Collection;
import java.util.*;
public class book1 {
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add("Maths");
		a.add("Geography");
		a.add("English");
		
		ArrayList b=new ArrayList();
		b.add("Maths");
		b.add("Geography");
		b.add("Hindi");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the book");
		Object str=sc.nextLine().trim();
		
		System.out.println(a.retainAll(b));
		System.out.println(a);
	}

}

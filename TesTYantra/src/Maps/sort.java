package Maps;

import java.util.ArrayList;
import java.util.Collections;

public class sort 
{
	public static void main(String[] args)
	{
		//int a[]= {25,16,32,36,6};
		ArrayList l=new ArrayList();
		l.add(25);
		l.add(16);
		l.add(32);
		l.add(36);
		l.add(6);
		System.out.println("Before sorting");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(" After Before sorting");
		System.out.println(l);
		
	}

}

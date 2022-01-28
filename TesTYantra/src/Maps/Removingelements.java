package Maps;

import java.util.HashSet;

public class Removingelements {

		public static void main(String[] args)
		{
		String a="hi hello welcome hi to bengaluru";
	
		String c[]=a.split(" ");
		HashSet s=new HashSet();
		for(int i=0;i<c.length;i++) 
		{
			s.add(c[i]);
		}
		String z="";
		for(Object o:s) 
		{
			String s1=(String)o;
			z=z+" "+s1;
		}
		System.out.println(z);

		}

	}



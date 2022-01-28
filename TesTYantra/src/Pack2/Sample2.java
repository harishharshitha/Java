package Pack2;

import Packages.Demo1;

public class Sample2 extends Demo1 {
	protected int j=9;
	protected void sample()
	{
		System.out.println(+j);
	}

	
	public static void main(String[] args)
	{
		
		Sample2 s1=new Sample2();
		System.out.println(s1.j);
		System.out.println(s1.c);
		s1.sample();
		
	}

}


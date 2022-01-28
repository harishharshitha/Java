package Pack2;

import Packages.Demo;

public class Sample {
	int b=2;
	void sample()
	{
		System.out.println(+b);
	}
	public static void main(String[] args)
	{
		Sample s=new Sample();
		Demo d=new Demo();
		d.demo();
		System.out.println(Demo.a);
		s.sample();
		System.out.println(s.b);
	}

}

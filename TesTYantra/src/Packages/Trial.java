//protected in one class

package Packages;

public class Trial 
{
	protected int c=40;
	protected void demo1()
	{
		System.out.println("demo()");
	}

 
	public static void main(String[] args)
	{
		Trial s=new Trial();
		s.demo1();
		System.out.println(s.c);
	}

}

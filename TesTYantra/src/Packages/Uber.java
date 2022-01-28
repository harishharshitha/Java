//default in one class

package Packages;

public class Uber {
	int a=10;
	public void tri()
	{
		System.out.println("HI");
	}

	public static void main(String[] args)
	{
		Uber o=new Uber();
		System.out.println(o.a);
		o.tri();
	}

}

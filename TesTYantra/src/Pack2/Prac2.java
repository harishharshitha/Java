//default

package Pack2;

import Packages.Prac;

 class Prac2 extends Prac {
	int f=2;
	void trio()
	{
		System.out.println("trio()");
	}
	
	public static void main(String[] args)
	{
		Prac p=new Prac();
		p.tri();
		Prac2 p1=new Prac2();
		p1.trio();
	}

}

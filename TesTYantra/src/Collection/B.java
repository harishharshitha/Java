package Collection;

import java.util.ArrayList;

public class B {
	public static void main(String[] args)
	{

	ArrayList<Integer> ls=new ArrayList<>();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	ls.add(40);

	int sum=0;
	for(Integer i:ls)
	{
		sum=sum+i;
	}
	System.out.println(sum);
	}

}

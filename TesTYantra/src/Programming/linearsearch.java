package Programming;

import java.util.Scanner;

public class linearsearch {
	public static void main(String[] args)
	{
	/*Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size= sc.nextInt();
	int a[]=new int[size];
	
	System.out.println("enter the find");
	int find=sc.nextInt();
	
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the "+(i+1)+" integer value");
		a[i]=sc.nextInt();*/
		
		int a []= {3,2,6,7};
		int find=3;
		for(int i=0;i<a.length;i++)
		{
		if(a[i]==find)
		{
			System.out.println(+find);
		}
	}
	}

}


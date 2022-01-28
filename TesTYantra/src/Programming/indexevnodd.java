//first print even numbers from an array next odd numbers from an array

package Programming;

import java.util.Scanner;

public class indexevnodd 
{
	public static void main(String[] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size= sc.nextInt();
		float na[]=new float[size];
		float a1[]=new float[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the "+(i+1)+" integer value");
			a1[i]=sc.nextFloat();
		}
		
		for(int i=0;i<size;i++)
		{
			na[i]=a1[i];
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(na[i]);
		}

	}

}

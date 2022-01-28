//printing the sum of even and odd 

package Programming;

import java.util.Scanner;

public class evnodd {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size= sc.nextInt();
		int a[]=new int[size];
		int ev_sum=0;
		int odd_sum=0;
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the "+(i+1)+" String value");
			a[i]=sc.nextInt();
		}
			for(int i=0;i<a.length;i++)
			{
				if((i+1)%2==0)
				{
					ev_sum=ev_sum+a[i];
				}
				else
				{
					odd_sum=odd_sum+a[i];
				}
			//print the values of even index only
			}
			System.out.println(ev_sum);
			//System.out.println(odd_sum);

}
	
}
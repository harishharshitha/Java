//summation of integer values in an array

package Programming;

import java.util.Scanner;

public class sum {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size= sc.nextInt();
	int a[]=new int[size];
	int sum=0;
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the "+(i+1)+" integer value");
		a[i]=sc.nextInt();
		
	}
	for(int i=0;i<size;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("the sum of all the inters is:" +sum);
	}

}

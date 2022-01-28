//printing 5 integers values from an array

package Programming;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size= sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the "+(i+1)+" integer value");
		a[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}

}
}

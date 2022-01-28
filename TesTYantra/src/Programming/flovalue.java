//printing the float values

package Programming;

import java.util.Scanner;

public class flovalue {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size= sc.nextInt();
	float na[]=new float[size];
	float a[]=new float[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the "+(i+1)+" integer value");
		a[i]=sc.nextFloat();
	}
	
	for(int i=0;i<size;i++)
	{
		na[i]=a[i];
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(na[i]);
	}

}
}

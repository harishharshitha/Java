//printing 5 strings values from an array

package Programming;
import java.util.Scanner;
public class Demo
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size= sc.nextInt();
	String a[]=new String[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the "+(i+1)+" String value");
		a[i]=sc.nextLine();
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
}
}

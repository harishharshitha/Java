package Programming;
import java.util.Arrays;
import java.util.Scanner;
public class Binarysearch
{
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
	int low=0;
	int high=a.length-1;
	int mid=0;
	Arrays.sort(a);
	
	System.out.println("enter the element");
	int key=sc.nextInt();
	boolean flag=false;
	while(low<=high)
	{
		mid=(low+high)/2;
		if(key==a[mid])
		{
			flag=true;
			break;
		}
		else if(key>a[mid])
		
			low=mid+1;
			else
				high=mid-1;
		}
		if(flag==true)
		
			System.out.println(" element is found");
			else	
				System.out.println("element is not found");
		
	}
}
	
	



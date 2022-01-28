package Programming;

import java.util.Scanner;

public class Addarray {
	public static void main(String[] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int a1size= sc.nextInt();
		int a1[]=new int[a1size];
		for(int i=0;i<a1size;i++)
		{
			System.out.println("enter the "+(i+1)+" integer value");
			a1[i]=sc.nextInt();
		}
		System.out.println("enter the size");
		int bsize= sc.nextInt();
		int b[]=new int[bsize];
		for(int i=0;i<bsize;i++)
		{
			System.out.println("enter the "+(i+1)+" integer value");
			b[i]=sc.nextInt();
		}
		int csize=a1size+bsize;
		int c[]=new int[csize];
		int j=0;
		for(int i=0;i<csize;i++)
		{
			if(i<a1size)
			{
				c[i]=a1[i];
			}
			else
			
				c[i]=b[j++];
		}
		for(int i=0;i<csize;i++)
		{	
			System.out.println(c[i]);
		}
	
	}
	}

package Maps;

import java.util.Scanner;

public class minnumbers 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b[]=new int[a];
		System.out.println("enter the  values");
		for(int i=0;i<a;i++){
		b[i]=sc.nextInt();
		}
		int temp=0;
	
	for (int i=0;i<a-1;i++ )
	{ 

		for (int j=i+1;j<a ;j++ )
		{
			if(b[i]>b[j]){
			temp=b[i];
			b[i]=b[j];
			b[j]=temp;

			}
		}
	}
	System.out.println(b[0]+b[1]);
	
	
	

}

}


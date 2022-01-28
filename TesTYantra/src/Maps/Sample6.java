package Maps;

import java.util.Scanner;

public class Sample6 {
public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String");
	String rev=" ";
	String a1[]=" ".split(" ");
	String s=sc.nextLine();
	int a=s.length();
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+a1[i]+" ";
	}
	System.out.println("the reversed string is:" +rev);
}
}

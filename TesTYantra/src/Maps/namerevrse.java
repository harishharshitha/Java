package Maps;

import java.util.Scanner;

public class namerevrse {
	public static void main(String[] args)
	{
		String str[]="MY NAME IS HARSHITHA".split(" ");
		String rev=" ";
		for(int i=str.length-1;i>=0;i--)
		{
			rev=rev+str[i]+" ";
		}
		System.out.println("the reversed string is:" +rev);
	}

}

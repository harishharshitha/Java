package Maps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class B {
	public static void main(String[] args) throws IOException
	{
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the text");
		//int i1=sc.nextInt();
		FileInputStream f=new FileInputStream("C:\\TesTYantra\\output.txt");
		int a=f.read();
		while((a)!=-1)
		{
			System.out.println((char)a);
			a=f.read();
		}
		f.close();
		System.out.println();
		System.out.println("Successfull");
		
	}

}

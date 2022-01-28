package Maps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class G {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the text");
	String str=sc.nextLine();
	FileOutputStream f=null;
	try {
	
	 f=new FileOutputStream("C:\\TesTYantra1\\output1.txt");
	
	//close();
	}
	catch(FileNotFoundException e)
	{
		System.out.println("FileNotFoundException Handled");
	}
	
	
		for(int i=0;i<str.length();i++)
		{
			try
			{
			f.write(str.charAt(i));
		    }
	
	catch(IOException e)
	{
		System.out.println("IO exception Handled");
	}
		}
	System.out.println("Successfully");
		}
}



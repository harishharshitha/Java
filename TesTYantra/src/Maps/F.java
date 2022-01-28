package Maps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F
{
public static void main(String[] args) throws IOException
{
	try {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the text");
	String str=sc.nextLine();
	FileOutputStream f=new FileOutputStream("C:\\TesTYantra1\\output1.txt");
	for(int i=0;i<str.length();i++)
	{
		f.write(str.charAt(i));
	}
	f.close();
	}
	catch(FileNotFoundException e)
	{
		System.out.println("FileNotFoundException Handled");
	}
	catch(IOException e)
	{
		System.out.println("IO exception Handled");
	}
	System.out.println("Successfully");

}
}

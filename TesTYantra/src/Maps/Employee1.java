package Maps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee1 {
	public static void main(String[] args) throws Exception
	{
		FileOutputStream f=new FileOutputStream("C://TestYantra//output3.txt");
		System.out.println("successfully created");
		ObjectOutputStream o=new ObjectOutputStream(f);
		
		
		Employee e=new Employee(1,"abc",600.0);
		System.out.println("serialization done");
				o.writeObject(e);	
				
				System.out.println("successfully done");
				o.close();
				
				FileInputStream f1=new FileInputStream("C://TestYantra//output1.txt");
				System.out.println("successfully created");
				ObjectInputStream o1=new ObjectInputStream(f1);
				System.out.println(o1.readObject());
				o.close();
				
	}



	}



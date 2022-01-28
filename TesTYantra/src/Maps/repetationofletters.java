package Maps;

import java.util.Scanner;

public class repetationofletters {
	
	
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String str = sc.nextLine();
			char[]ch = str.toCharArray();
				
			for(int i=0; i<ch.length; i++)
			{
				int count = 1;
				if(ch[i] == 0)
					
					continue;
				
				for(int j=i+1; j<ch.length; j++)
				{
					if(ch[i] == ch[j])
					{
						ch[j] = 0;
						count++;
						
					}
				}
				
				System.out.println("The count of "+ch[i]+" is "+count);
			}
		
	}
}

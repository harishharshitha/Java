//WAP to accept the sentence from the user then that sentence remove the duplicates and print the count of unrepeated words in 
//the sentence

package Collection;
import java.util.*;
public class Sample {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
	   String str=sc.nextLine().trim();
	    
	    HashSet h=new HashSet();
	    for(int i=0;i<str.length();i++)
	    {
	    	h.add(str.charAt(i));
	    }
	    
	    System.out.println("the characters without repetation:" +h);
		
	}

}

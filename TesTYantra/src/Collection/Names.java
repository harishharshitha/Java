package Collection;
import java.util.*;
public class Names 
{
	static String s;
	Names(String s)
	{
		Names.s=s;
	}
public static void main(String[] args)
{
	HashSet<Object> hs=new HashSet<Object>();
	Names ws1=new Names("Pranavi");
	Names ws2=new Names("madhavi");
	String s1=new String("jahnavi");
	String s2=new String("vyshnavi");
	String s3=new String("vyshnavi");
	hs.add(ws1);
	hs.add(ws2);
	hs.add(s1);
	hs.add(s2);
	hs.add(s3);
	System.out.println(hs.size());
}
}

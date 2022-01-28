package Collection;
import java.util.*;
public class A 
{
public static void main(String[] args)
{

ArrayList ls=new ArrayList();
ls.add(10);
ls.add(20);
ls.add(30);
ls.add(40);

int sum=0;
for(Object i:ls)
{
	Integer a=(Integer)i;
	sum=sum+a;
}
System.out.println(sum);
}
}

package Collection;
import java.util.*;
import java.util.ArrayList;
public class CollectionsTest {
	int i,j;
	CollectionsTest(int i,int j)
	{
		this.i=i;
		this.j=j;
		
	}
	
	CollectionsTest(int i)
	{
		this.i=i;
	
	}
	
	public static void main(String[] args)
	{
		ArrayList <Object> l=new ArrayList<>();
		l.add(new CollectionsTest(5,4));
		l.add(l.get(0));
		l.add(new CollectionsTest(6,0));
		l.add(new CollectionsTest(5,4));
		l.add(new CollectionsTest(6));
		Set<CollectionsTest> s=new HashSet<CollectionsTest>();
		s.addAll(l);
		System.out.println("l="+l.size()+ "s=" +s.size());
	}

}

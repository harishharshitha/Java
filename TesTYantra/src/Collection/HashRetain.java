package Collection;
import java.util.HashSet;
public class HashRetain 
{
public static void main(String[] args)
{
	HashSet<String> hashset=new HashSet<String>();
	hashset.add("A");
	hashset.add("B");
	hashset.add("C");
	hashset.add("D");
	hashset.add("E");
	
	HashSet<String> subset=new HashSet<String>();
	subset.add("E");
	subset.add("B");
	subset.add("A");
	subset.add("F");
	hashset.retainAll(subset);
}
}

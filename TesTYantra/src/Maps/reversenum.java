package Maps;

public class reversenum {
	public static void main(String[] args)

	{
		int no=17300615;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		
		System.out.println(rev);
	}
	
}

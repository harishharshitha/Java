package Maps;

public class userdefinedexception extends Exception 
{
	public String getMessage()
	{
		return "not valid";
	}
	public static void main(String[] args) throws Exception
	{
		try
		{
			throw new Exception("custom exception");
		}
		
		finally
		{
			System.out.println("handled");
		}
		
		
	}

}

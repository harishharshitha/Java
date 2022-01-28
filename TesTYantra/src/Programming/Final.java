package Programming;

public class Final {

	final int a=10;
	
	static public void demo()
	{
		System.out.println("Hello Java");
	}
	class Driver extends Final
	{
	public static void main(String[] args)
	{
		Final.demo();
	}
	
}
}

package Collection;

import java.util.ArrayList;

public class Book {
	int book_price;
	String book_name;
	
	Book(int book_price,String book_name)
	{
		this.book_price=book_price;
		this.book_name=book_name;
	}
	
	public void display()
	{
		System.out.println("book_price:" +book_price);
		System.out.println("book_name:" +book_name);
	}
	
	public static void main(String[] args)
	{
		ArrayList<Book> a=new ArrayList<>();
		a.add(new Book(250,"one arrange murder"));
		a.add(new Book(200,"the girl at the room 105"));
		
		for(Book b:a)
		{
			b.display();
		}
	}
	

}

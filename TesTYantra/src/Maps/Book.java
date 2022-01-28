package Maps;

public class Book implements Comparable
{
int bid;
String title;
String Author;

Book(int bid,String title,String Author)
{
	this.bid=bid;
	this.title=title;
	this.Author=Author;
}

public int compareTo(Object o)
{
	Book b=(Book)o;
	if(this.bid==b.bid)
		return 0;
	else if(this.bid>b.bid)
		return 1;
	else
		return -1;
}

public void display()
{
		System.out.println(bid);
		System.out.println(title);
		System.out.println(Author);
}
}

package Collection;

import java.util.*;


class Channel
{
	String c_name;
	int c_price;

	Channel(String c_name,int c_price)
	{
		this.c_name=c_name;
		this.c_price=c_price;
	}
}

class Regional_pack
{
	String r_name;
	int r_price;

	Regional_pack(String r_name,int r_price) 
	{
		this.r_name=r_name;
		this.r_price=r_price;
	}
}

class Tata_sky
{
	String p_name;
	long contact_no;
	String dob;
	String gender;
	String email;
	int tatasky_id;
	double balance;

	HashSet<Channel> t=new HashSet<>();
	t.add(new Channel("GEMINI",300));
	t.add(new Channel("MAA TV",350));
	t.add(new Channel("ZEE TELUGU",400));

	TreeSet<Regional_pack> t1=new TreeSet<>();
	t1.add(new Regional_pack("tatasky_reg1",200));
	t1.add(new Regional_pack("tatasky_reg2",950));
	t1.add(new Regional_pack("tatasky_reg3",500));
    
}

public class Driver {

}

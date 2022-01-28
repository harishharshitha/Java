package Maps;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*class Serializable
{
	
}*/

public class Employee  implements Serializable
{
int id;
String name;
double salary;

Employee(int id,String name,double salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}

public String toString()
{
	return "id:" +id+"name:" +name+"salary:" +salary;
}

}



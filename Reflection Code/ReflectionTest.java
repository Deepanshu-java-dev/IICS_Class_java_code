import java.lang.reflect.*;
class Person
{
	public void show()
	{
		
	}
	public void display()
	{

	}
}
public class ReflectionTest
{
	public static void main(String[] args)
	{
		Person p=new Person();
		Class c=p.getClass();
		String classname =c.getName();
		System.out.println("Class Name :"+classname);
		Method[] methods=c.getDeclaredMethods();
		for(Method m:methods)
		{
			System.out.println("Method Name :"+m.getName());
		}	
	}
}
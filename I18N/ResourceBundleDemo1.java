import java.util.Scanner;
import java.util.*;
class ResourceBundleDemo1
{
	public static void main(String[] args)
	{
		Scanner str=new Scanner(System.in);
		System.out.print("Message : ");
		String s = str.next();
		Locale locale=new Locale("hi");
		ResourceBundle bundle=ResourceBundle.getBundle("MyLables",locale);
		String greeting = bundle.getString("greeting");
		//String farewell = bundle.getString("farewell");
		System.out.println("Hindi : "+greeting);
		//System.out.println(farewell);
	}
}
import java.util.*;
class ResourceBundleDemo
{
	public static void main(String[] args)
	{
		Locale locale=new Locale("fr");
		ResourceBundle bundle=ResourceBundle.getBundle("MyLabels",locale);
		String greeting = bundle.getString("greeting");
		String farewell = bundle.getString("farewell");
		System.out.println(greeting);
		System.out.println(farewell);
	}
}
import java.util.*;
class JavaLocaleEx
{
	public static void main(String[] args)
	{
		Locale locale1=new Locale("Fr","Uk");
		System.out.println("Locale :"+locale1);
		//print language
		System.out.println(locale1.getDisplayLanguage());
			//print country
		System.out.println("Country Name :"+locale1.getDisplayCountry());
			//get a hash code and print it
		System.out.println("HashCode for this locale:"+locale1.hashCode());

	}
}
import java.text.NumberFormat;
import java.util.*;
public class NumberFormatTest
{
	public static void main(String[] args)
	{
		double amount=123456.78;
		
		//Us Formating -> print $123,456.78
		NumberFormat usFormat= NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(usFormat.format(amount));

	}
}
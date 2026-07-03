import java.lang.String;
public class StringDemo1
{
	public static void main(String args[])
	{
		String s1="Hello";
		String s2="hello";
		String s3=new String("ABC");
		String s4=new String("ABC");
		String s5=new String("Abc");
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			System.out.println(s1.equalsIgnoreCase(s2));
			System.out.println();
			System.out.println(s3==s4);
			System.out.println(s3.equals(s4));
			System.out.println();
			System.out.println(s3==s5);
			System.out.println(s3.equals(s5));
			System.out.println();
			System.out.println(s1.compareTo(s2));
			System.out.println(s1.compareToIgnoreCase(s2));
			System.out.println(s3.compareTo(s4));
			System.out.println(s4.compareTo(s5));
	}
}
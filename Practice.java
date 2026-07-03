import java.lang.String;
class Practice
{
	public static void main(String[]args)
	{
		String a="Deepanshu";
		String b="Ashu";
		String c="Ashu";
		String sc=new String("Deepanshu");
		System.out.println("No of Alphabat:"+(sc.length()));
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(b==c);
		System.out.println(b.equals(c));
	}
}


class ReflectionDemo1
{
	public static void main(String[] args)
	{
		try
		{
			Class myClass=Class.forName("java.lang.String");
			System.out.println("Class Name :"+myClass.getName());
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
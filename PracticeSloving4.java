class defalutConst
{
	defalutConst()
	{
		System.out.println("It is Defalut Constructor");	
	}
	void show()
	{
		System.out.println("This is show method");
	}
}
class PracticeSloving4
{
	public static void main(String[]args)
	{
		defalutConst ob= new defalutConst()	
			ob.show();
	}
}
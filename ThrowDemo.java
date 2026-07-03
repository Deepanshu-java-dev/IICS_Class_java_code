class ThrowDemo
{
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("invalid");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args)
		{
			validate(13);
		}
}
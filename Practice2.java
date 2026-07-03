// java porgram to swaping two number useing temporary variable

class Practice2
{
	public static void main(String[] args)
	{
		int a=5; // first number
		int b=10;  // second number
		System.out.println("Before Swaping : a = " + a + " , b = " +b);
		int temp=a;  //store a's value temporaliy
		a=b;      // assin b's value to a
		b=temp;  // assin tem (old a) to b
		System.out.println("After Swaping : a =" + a + " , b = " + b);
	} 
}
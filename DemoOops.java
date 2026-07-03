class DemoOop
{
		int a,b;		//class variable
		public void getdata()
		{
			a=10; 		// Method
			b=20;
		}
		public void show()
		{
			System.out.println("A : "+a);
			System.out.println("B : "+b);
		}		
}
class DemoOops
{
	public static void main(String[]args)
	{
		
		DemoOop ob=new DemoOop();	//object creation
		ob.getdata();
		ob.show();
		
	}
}
class Practice11
{
	int a;
	void getdata()
	{
	for(int i=0;i<=10;i++)
		{
		a=i;
		}
	}
	void show()
	{
	System.out.println(a);
	}
}
class Practice11Test
{
public static void main(String[]args)
{
	Practice11 ob=new Practice11();
	ob.getdata();
	ob.show();
}
}
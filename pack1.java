package Arithmatic;
public class Pack1
{
	int a;
	int b;
	int sum;
	public void add(int x,int y)
	{
		sum=x+y;
	System.out.println("Addition of A and B :"+sum);
	}
	public void sub(int a,int b)
	{
		sum=a-b;
	System.out.println("Subtract of A and B :"+sum);
	}
	public void mul(int p,int q)
	{
		sum=p*q;
	System.out.println("Multiply of A and B :"+sum);
	}
	public void divide(int q,int p)
	{
		sum=q/p;
	System.out.println("Divide of A and B :"+sum);
	}
}

class Arrayques5
{	
	public static void main (String[] args)
	{
		int sum=0,a[]= new int[10];
		a [0]= 25;
		a [1]= 26;
		a [2]= 38;
		a [3]= 98;
		a [4]= 45;
		a [5]= 65;
		a [6]= 85;
		a [7]= 37;
		a [8]= 15;
		a [9]= 17;
		for(int i=0; i<10; i++)
		{
			if(i%2!=0)
			sum=sum+i;
			System.out.println(sum);
		}
	}
}  
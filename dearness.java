class Dear
{
	public static void main(String[]args)
	{
		int code= 2;
		int salary= 10000;
		int da= 0;
		switch(code)
		{
			case 1: da=salary*10/100;break;
			case 2: da=salary*15/100;break;
			case 3: da=salary*20/100;break;
			default: System.out.println("da is not given");break;
		}
			System.out.println("DA:"+da);
	} 
			
}
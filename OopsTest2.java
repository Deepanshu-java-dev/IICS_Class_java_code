class Ooptest2
{
		int maths,phys,chem,eng,Total,Avg;
		public void Subjectmarks()
		{
			maths=40;
			phys=60;
			chem=50;
			eng=55;
		}
		public void Totalmarks()
		{
			Total=maths+phys+chem+eng;
		}
		public void Averagemarks()
		{
			 Avg= Total/4;
		}
		public void Result()
		{
		System.out.print("\n"+"Maths " + "\t"+maths);
		System.out.print("\n"+"Physics " + "\t"+phys);
		System.out.print("\n"+"Chemistry " + "\t"+chem);
		System.out.print("\n"+"English " + "\t"+eng);
		System.out.println("\n "+"Total Marks "+Total);
		System.out.println("\n"+"Average Marks "+Avg);
		} 
}
class OopsTest2
{
	public static void main (String[] args)
	{
		Ooptest2 ob = new Ooptest2();
		ob.Subjectmarks();
		ob.Totalmarks();
		ob.Averagemarks();
		ob.Result();
	} 
}
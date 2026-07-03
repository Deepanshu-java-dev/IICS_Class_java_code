class Commandques1
{
	public static void main(String []args)
	{
		int maths=Integer.parseInt(args[0]);
		int phy=Integer.parseInt(args[1]);
		int chem=Integer.parseInt(args[2]);
		System.out.println("Maths Marks : "+maths);
		System.out.println("Physics Marks : "+phy);
		System.out.println("Chemistry Marks: "+chem);

			int total= maths+phy+chem;
			int avg= total/ 3;
		System.out.println("Total marks:"+total);
		System.out.println("Average marks:"+avg);
	}
}
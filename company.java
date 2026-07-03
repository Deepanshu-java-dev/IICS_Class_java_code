class Company
{
	public static void main(String[] args)
	{
		System.out.println("claclate Bonus, commission,Gross salary");
				int Basicsalary= 2000;
				int Bonusrate= 200;
				float commissionr= 0.02f;
				int solditem= 10;
				int price= 100;
		System.out.println("Bonus:"+Bonusrate);
		System.out.println("Sold Items:"+solditem);
			int Bonus= Bonusrate*solditem;
		System.out.println("Bonus:"+Bonus);

		System.out.println("Commission Rate:"+commissionr);
		System.out.println("Price:"+price);
			float commission= commissionr*solditem*price;
		System.out.println("Commisssion:"+commission);
		
		System.out.println("Gross Salary:"+Basicsalary);
				int Grosssalary= Basicsalary+Bonusrate+price;
	System.out.println("TotalGross Salary:"+Grosssalary);
		
		






	}
}
class Employe
{
	int id,salary;
	String name;
	void getdata(int a, int b, String c)
	{
		id=a;
		salary=b;
		name=c;
	}
	void showdata()
	{
		System.out.println("Employe Id:"+id);
		System.out.println("Employe Salary:"+salary);
		System.out.println("Employe name:"+name);
	}
}
class Test extends Employe
{
	double hra,da,pf,gross,netsalary;
	void getdata()
	{
		hra=0.15*salary;
		da=0.10*salary;
		pf=0.03*salary;
	}
	void calculate()
	{
		gross= salary+hra+da;
		netsalary=gross-pf;
	}
	void show()
	{
		System.out.println("Employe Hra:"+hra);
		System.out.println("Employe Da:"+da);
		System.out.println("Employe Pf:"+pf);
		System.out.println("Employe Gross Salary:"+gross);
		System.out.println("Employe Net Salary:"+netsalary);
	}
}
class EmployeInherits2
{
	public static void main(String[] args)
	{
		Test ob = new Test();
		ob.getdata(1001,20000,"Deepanshu");
		ob.showdata();
		ob.getdata();
		ob.calculate();
		ob.show();
	}
}
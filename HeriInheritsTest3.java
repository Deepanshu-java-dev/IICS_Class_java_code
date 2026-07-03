class Employe
{
	int id,salary;
	String name;
	void display()
	{
		System.out.println("Employe Id:"+id);
		System.out.println("Employe Salary:"+salary);
		System.out.println("Employe name:"+name);
	}
}
class Manger extends Employe
{
	String dept;
	void showmanger()
	{
		System.out.println("Department:"+dept);
	}
}
class Developer extends Employe
{
	String lang;
	void showDeveloper()
	{
	  System.out.println("Programming Language:"+lang);
	}
}
class HeriInheritsTest3
{
	public static void main(String[] args)
	{
		Manger ob = new Manger();
		ob.id=1001;
		ob.name="Ashu";
		ob.salary=35000;
		ob.dept="Finace";
		ob.display();
		ob.showmanger();
		Developer obj=new Developer();
		obj.id=1002;
		obj.name="Ritika";
		obj.salary=45000;
		obj.lang="JAVA";
		obj.display();
		obj.showDeveloper();
	}
}
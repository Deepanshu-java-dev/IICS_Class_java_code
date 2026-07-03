class MainControl
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student ob = new Student();

		System.out.println("Enter name: ");
		ob.setName(sc.nextLine());
		System.out.println("Enter age: ");
		ob.setAge(sc.nextInt());

		System.out.println("\nStudent Details");
		System.out.println("Name:"+ob.setName());
		System.out.println("Age:"+ob.setAge());
	}
}
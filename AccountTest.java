interface Account
{
	void deposit(int amt);
	String getAccountType();
}
class savingAccount implements Account
{
	String accNo;
	int balance;

	public void setAccNo(String no)
	{
		accNo=no;
	}
	public void deposit(int amt)
	{
		balance = balance + amt;
	System.out.println("Deposited" + amt + "in saving Account:" +accNo);
	}
	public String getAccountType()
	{
	return "Saving Account";
	}
}
class currentAccount implements Account
{
	String accNo;
	int balance;

	public void setAccNo(String no)
	{
		accNo=no;
	}
	public void deposit(int amt)
	{
		balance = balance + amt;
	System.out.println("Deposited" + amt + "in current Account:" +accNo);
	}
	public String getAccountType()
	{
	return "Current Account";
	}
}
class AccountTest
{
	public static void main(String[] args)
	{
		savingAccount sa= new savingAccount();
		sa.setAccNo("SA101");
		sa.deposit(1000);
		System.out.println(sa.getAccountType());
		currentAccount ca= new currentAccount();
		ca.setAccNo("SA102");
		ca.deposit(100);
		System.out.println(ca.getAccountType());
	}
}
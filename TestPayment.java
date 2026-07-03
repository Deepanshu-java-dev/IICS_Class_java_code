interface Payment
{
	public abstract void Makepayment(int amt);
	String getPaymentMethod();
}
class Creditcard implements Payment
{
	String cardNo;
	int amount;
	public void MakePayment(int amt,String cardNo)
	{
		System.out.println("Make payment by credit card "+ amt + cardNo);		}
}
class TestPayment
{
	public static void main (String[] args)
	{
		Creditcard cc = new Creditcard();
	}
	
}
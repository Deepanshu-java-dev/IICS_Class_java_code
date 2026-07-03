class ArmstrongQues 
{
	public static void main(String[] args)	
	{
		int n=21;
		int original = n;
        	int sum = 0;

        // count digits
        int count = 0;
        int temp = n;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

       // Armstrong logic
        temp = n;
        while (temp > 0) {
            int dig = temp % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * dig;
            }

            sum = sum + power;
            temp = temp / 10;
        }
	//System.out.println(sum);

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
	}
}
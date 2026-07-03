//Take Value to user
import java.util.Scanner;
import java.util.*;
class TreeMapQues
{
	public static void main(String[] args)
	{
		TreeMap<String,Integer> name=new TreeMap<>();
		for(int i=1;i<5;i++)
		{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name :");
			String n= sc.next();
		System.out.println("Enter age :");
			int a= sc.nextInt();
			name.put(n,a);
		}
		System.out.println(name);
	}
}
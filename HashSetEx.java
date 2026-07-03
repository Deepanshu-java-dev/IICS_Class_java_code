import java.util.HashSet;
import java.util.Set;
public class HashSetEx
{
	public static void main(String[] args)
	{
		Set setObj=new HashSet();
		setObj.add("ram");
		setObj.add("shyam");
		setObj.add("Rohit");
		setObj.add("ram");
		setObj.add("shyam");
		System.out.println("set Object--"+setObj);
	}
} 
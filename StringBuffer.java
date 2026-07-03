import java.lang.String;
class StringBuffer 
{
	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer("Object language");
		System.out.println("Original String ="+str);
		System.out.println("Length of String ="+str.length());
			for(int i=0; i<str.length();i++)
			{
				int p= i+1;
					System.out.println("Character at 						position"+p+"is"+(str.charAt(i)));
			}
		String astr=new String(str.toString());
		int pos=astr.indexOf("Language");
		str.insert(pos,"oriented");
			System.out.println("Modified String"+str);
				str.setCharAt(6,'_');
			System.out.println("String Now"+str);
				str.append("improves security");
			System.out.println("Appended String="+str);
	}
}
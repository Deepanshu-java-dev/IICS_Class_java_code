class SwitchVowel
{
	public static void main(String[]args)
	{
		char ch='u ';
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("Vowel");break;
			default: System.out.println("Consonant");break;
			}
	}
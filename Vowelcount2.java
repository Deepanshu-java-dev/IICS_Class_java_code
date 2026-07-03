import java.util.Scanner;

public class Vowelcount2 
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        int wordCount = 0;
	        int alphabetCount = 0;
        	String tempWord = "";
       		for (int i = 0; i < str.length(); i++) 
		{
        	    char ch = str.charAt(i);
	            // Alphabet count
            		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
			{
            		    alphabetCount++;
            		}
		            // Word logic
            		if (ch !=' ') 
			{
                		tempWord = tempWord + ch;
            		} 
			else 
			{
              			if (!tempWord.equals("")) 
				{
                    			System.out.println("Word: " + tempWord);
                    				wordCount++;
                    				tempWord = "";
               			}
         		 }
        	}
			 if(!tempWord.equals(""))
			{
            		System.out.println("Word: " + tempWord);
            		}	wordCount++;
        	
       	 	System.out.println("Total Words: " + wordCount);
        	System.out.println("Total Alphabets: " + alphabetCount);
   	 }
}
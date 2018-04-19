package string;

import java.util.Scanner;

public class CountingUniqueCharacterInString {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
	    int count;
	    int count1 = 0;
	    
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a String : ");
	    String string = in.nextLine();
	    
	    int[] freq = new int[string.length()];

	    for(int i=0; i<string.length(); i++) {
	        freq[i] = -1;
	    }

	    for(int i=0; i<string.length(); i++)
	    {
	        count = 1;
	        for(int j=i+1; j<string.length(); j++)
	        {
	            if(string.charAt(i)==string.charAt(j))
	            {
	                count++;
	                freq[j] = 0;
	            }
	        }
	        if(freq[i]!=0)
	            count1++;
	    }
	    
	    System.out.println(count1);
	 
	}

}

package easy;

import java.util.Scanner;

public class TimeConversion {
	
	static String timeConversion(String s) {
        
		String subString1 = s.substring(0, 2);
        String subString2 = s.substring(2, 8);
        String subString3 = s.substring(8);
        String str = "";
        
        if(subString1.equals("12")) {
        	if(subString3.equals("AM")) 
        		str = "00"+subString2;
        	else
        		str = subString1+subString2;
        }
        
        else {
        	if(subString3.equals("AM"))
        		str = subString1+subString2;
        	else {
        		int hour = Integer.parseInt(subString1) + 12;
        		str = ""+hour+subString2;
        	}
        }
        
        return str;
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

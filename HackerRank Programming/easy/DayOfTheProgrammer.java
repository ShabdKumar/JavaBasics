package easy;

import java.util.Scanner;

public class DayOfTheProgrammer {
	
	static String solve(int year){
		String str = "";
		
		if((year < 1918)&&(year >= 1700)) {
			
			if(year%4 == 0) {
				str = ""+"12.09."+year;
			}
			else {
				str = ""+"13.09."+year;
			}
		}
		
		else if((year >= 1919)&&(year <=2700)) {
			
			if(((year%4 == 0)&&(year%100 != 0)) || (year%400 == 0)) {
				str = ""+"12.09."+year;
			}
			else {
				str = ""+"13.09."+year;
			}
		}
		
		else if(year == 1918) {
			str = ""+"26.09."+year;
		}
		
		return str;
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }

}

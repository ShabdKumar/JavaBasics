package easy;

import java.util.Scanner;

public class Kangaroo {
	static String kangaroo(int x1, int v1, int x2, int v2) {
       String str = "";
       if((x1>=x2)&&(v1>v2))
    	   str = "NO";
       else {
    	   for(int i=0; i>0; i++) {
    		   if(x1+(v1*i) == x2+(v2*i)) {
    			   str = "YES";
    			   break;
    		   }
    		   else 
    			   str = "NO";
    	   }
       }
       return str;
	}

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}

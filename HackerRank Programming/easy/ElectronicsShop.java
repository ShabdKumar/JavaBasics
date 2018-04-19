package easy;

import java.util.Scanner;
import java.util.TreeSet;

public class ElectronicsShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int s){
        
		for (int i = 0; i < drives.length; i++) {
			for (int j = i+1; j < drives.length; j++) {
				if(drives[i] < drives[j]) {
					int temp = drives[j];
					drives[j] = drives[i];
					drives[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = i+1; j < keyboards.length; j++) {
				if(keyboards[i] < keyboards[j]) {
					int temp = keyboards[j];
					keyboards[j] = keyboards[i];
					keyboards[i] = temp;
				}
			}
		}
		
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		for(int i=0; i<keyboards.length; i++) {
			for(int j=0; j<drives.length; j++) {
				if(keyboards[i]+drives[j] <= s) {
					tSet.add(keyboards[i]+drives[j]);
				}
			}
		}
		
		if(tSet.isEmpty())
			return -1;
		else
			return tSet.last();
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}

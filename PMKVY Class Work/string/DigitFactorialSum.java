package string;

public class DigitFactorialSum {
	
	static int factorial(int num) {
		if(num == 0)
			return 1;
		else
			return num*factorial(num-1);
	}

	public static void main(String[] args) {
		int rem;
		for(int i=1; i<=100000; i++) {
			int sum = 0;
			int num = i;
			while(num>0) {
				rem = num%10;
				sum = sum + factorial(rem);
				num = num/10;
			}
			
			if(i==sum)
				System.out.println(i);
		}
	}
}

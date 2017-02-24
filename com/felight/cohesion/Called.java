package com.felight.cohesion;

public class Called {
	
	// 1. Add 2 numbers
		public static int addInt(int num1, int num2) {
			return (num1 + num2);
			
		}
		 
	// 2. Add 2 double numbers
		public static double addDouble(double num1, double num2) {
			return (num1 + num2);
			
		}
		
	// 3. calculate speed
		public static double speed(double distance, double time) {
			return (distance/time);
			
		}
		
	// 4. Area of circle
		public static double areaOfCircle(double radius) {
			final double PI = 3.142;
			return (radius * radius * PI);
		
		}
		
	// 5. Factorial of given number
		public static int factorial(int num) {
			int i, factorial = 1;
			
			for(i=1; i<=num; i++)
				factorial = factorial * i;
			return factorial;
			
		}
		
	// 6. Given number is even or not
		public static boolean isEven(int num) {
				return (num % 2 == 0);
			
		}
		
	// 7. Given number is odd or not
		public static boolean isOdd(int num) {
			return (num%2 != 0);
			
		}
		
	// 8. Given number is prime or not
		public static boolean isPrime(int num) {
			int i;
		
			for(i=2; i<num; i++) {
				if(num%i == 0)
					break;
				
			}
			return (num==i);			
			
		}
		
	// 9. Given number is palindrome or not
		public static boolean isPalindrome(int num) {
			int remain, reverse=0, temp;
			temp=num;
				
			while(num>0) {
				remain = num%10;
				reverse = (reverse*10)+remain;
				num = num/10;
				
			}
			return (temp == reverse);
			
		}
		
	// 10. Fibonacci series of given number
		public static String fibonacci(int count) { 
	     	int n1=0, n2=1, n3, i;
	     	String result="";   
			
	     	for(i=0; i<count; i++) {
				if(i<=1)
				   	n3 = i;
					
				else {
					n3 = n1+n2;
					n1 = n2;
					n2 = n3;
					
				}
				result+=" "+n3;
				
	     	}
	     	return result; 
	    	
		}
		
	// 11. Given number divisible by 6 or not
		public static boolean isDivBy6(int num) {
			return (num%6 == 0);
			
		}
		
	// 12. Conversion of time from seconds to hours
		public static double secondToHour(double seconds) {
			return seconds/3600;
			
		}
		
	// 13. Counting digits in a given number
		public static int noOfDigits(int num) {
			int i=0;
				
			while(num > 0) {
				num = num/10;
				i++;
			
			}
			return i;
			
		}
		
	// 14. An integer the digits repeated twice
		public static String twice(int num) {
			String result = "";
			
			for(int i=1 ;i<=2 ;i++)
				result+=num;
			return result;
			
		}
		
	// 15. Hundredth place in a given number
		public static int hundredth(int num) {
			int i=1;
			int remain=0;
				
			while(i<=3) {
				remain = num%10;
				num = num/10;
				i++;
				
			}
			return remain;
			
		}
		
	// 16. Required runrate of the chasing team is
		public static double runRateRequired(double target, double maxover, double currentscore, double overbowled) {
			return ((target-currentscore) / (maxover-overbowled));
			
		}
		
	// 17. 3 integers converted to decimal number
		public static double makeDecimal(double num1, double num2, double num3) {
			return (num1+(num2/10)+(num3/100));
			
		}
		
	// 18. Sum of digits in a given number
		public static int sumOfDigit(int num) {
			int rem, sum=0;
				
			while(num>0) {
				rem = num%10;
				sum = sum+rem;
				num = num/10;
				
			}
			return sum;
			
		}
		
	// 19. AND of boolean inputs
		public static boolean and(boolean n1, boolean n2, boolean n3) {
			return (n1 && n2 && n3);
			
		}
		
	// 20. The number larger than one of next two numbers
		public static boolean largerThanOne(int num, int num1, int num2) {
			return ((num>num1) || (num>num2));
			
		}
		
	// 21. Numbers are in Ascending order or not
		public static boolean ascending(int num1, int num2, int num3) {
			return ((num1<num2) && (num1<num3) && (num2<num3));
			
		}
		
	// 22. Sum of 4 digits in a given number
		public static int sum4Digits(int num) {
			int rem, sum=0, i=1;
				
			while(i<=4) {
				rem = num%10;
				sum = sum+rem;
				num = num/10;
				i++;
				
			}
			return sum;
			
		}
		
	// 23. Area of square with 4 inputs
		public static double areaOfSquare(int x1, int y1, int x2, int y2) {
			return ((((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1))) * 0.5);
			
		}
		
	// 24. Add digits converted to 4 digits
		public static int repeat(int num) {
			int result=0;
			
			for(int i=1; i<=4; i++) {
				result = (result*10)+num;
				
			}
			return result;
			
		}
		
		public static int addRepeat(int n1, int n2, int n3) {
				int a, b, c;
				a = repeat(n1);
				b = repeat(n2);
				c = repeat(n3);
				return a+b+c;
			
		}
		
	// 25. Given number is multiple of either 3 or 7
		public static boolean isDivBy3Or7(int num) {
			return ((num%3==0) || (num%7==0));
			
		}
		
	// 26. Largest of given numbers
		public static int largest(int num1, int num2, int num3) {
			return (((num1>num2) && (num1>num3)) ? num1 : ((num2>num3) ? num2 : num3));
			
		}
		
	// 27. Days in month according to given number from 1-12
		public static int days(int choice) {
			if((choice==1) || (choice==3) || (choice==5) || (choice==7) || (choice==8) || (choice==10) || (choice==12))
				return 31;
			else if (choice==2)
				return 28;
			else if((choice==4) || (choice==6) || (choice==9) || (choice==11))
				return 30;
			else
				return 0;
			
		}
		
	// 28. Change case of the given character
		public static char changeCase(char ch) {
			int temp = (int)ch;
		
			if(temp>=97 && temp<=122)
				temp = temp-32;
			else if(temp>=65 && temp<=90)
				temp = temp+32;
			else
				return ((char)temp);
			return ((char)temp);
			
		}
		
	// 29. Given character is digit or not
		public static boolean isDigit(char ch) {
			int temp = (int)ch;
			return ((temp>48) && (temp<57));
			
		}
		
	// 30. Find the middle character of given character
		public static char midChar(char char1, char char2, char char3) {
			int num1 = (int)char1;
			int num2 = (int)char2;
			int num3 = (int)char3;
				
			if((num1<num2 && num1>num3) || (num1>num2 && num1<num3))					
				return char1;
			else if((num2<num1 && num2>num3) || (num2>num1 && num2<num3))
				return char2;
			else				
				return char3;
			
		}
		
	// 31. Last digit of given number are equal or not
		public static boolean sameLastDigit(int num1, int num2) {
			int rem1=num1%10, rem2=num2%10;
			return (rem1==rem2);
			
		}
		
	// 32. Addition for third number
		public static boolean addThird(int num1, int num2, int num3) {
			return ((num1 == num2+num3) || (num2 == num1+num3) || (num3 == num1+num2));
		
		}
		
	// 33. Lottery prize of given lottery number
		public static int lotteryPrize(int num) {
			if((num%4 == 0) && (num%7 == 0))
				return 20;
			else if(num%7 == 0)
				return 10;
			else if(num%4 == 0)
				return 6;
			else
				return 0;		
			
		}
		
	// 34. Lottery prize of 3 lottery tickets
		public static int lotteryPrize3(int num1, int num2, int num3) {
			return (lotteryPrize(num1) + lotteryPrize(num2) + lotteryPrize(num3));
		
		}
		
	// 35. Sum of 3 digits in a given number
		public static int sum3Digit(int num) {
			int rem, sum=0, i=1;
				
			while(i<=3) {
				rem = num%10;
				sum = sum+rem;
				num = num/10;
				i++;
				
			}
			return sum;
			
		}
		
	// 36. Black jack of the given numbers
		public static int blackJack(int num1, int num2) {
			if((num1 == num2) || (num1<21 && num2<21)||(num1==21 && num2==21))
				return -2;
			else if(num1>21 && num2>21)
				return -1;
			else if(num1==21 || num2==21)
				return 21;
			else
				return 0;
			
		}
		
	// 37. Reverse the given number
		public static int reverse(int num) {
			int remain, reverse=0;
		
			while(num>0) {
				remain = num%10;
				reverse = (reverse*10)+remain;
				num = num/10;
				
			}
			return reverse;
			
		}
		
	// 38. Given number is perfect number or not
		public static boolean perfect(int num) {
			int sum = 0;
		
			for(int i=1; i<(num/2); i++) {
				if(num%i == 0)
					sum = sum+i;
			
			}
			return (sum == num);
			
		}
		
}

package string;

public class ChangingCases {

	public static void main(String[] args) {
		
		String str = "Hello World";
		String result = changeCase(str);
		System.out.println(result);
	}

	private static String changeCase(String str) {
		String s = "";
		for(int i=0; i<str.length(); i++) {
			if((str.charAt(i) >= 65)&&(str.charAt(i) <= 91)) {
				s = s + (char)(str.charAt(i) + 32);
			}
			
			else if((str.charAt(i) >= 97)&&(str.charAt(i) <= 122)) {
				s = s + (char)(str.charAt(i) - 32);
			}
			
			else {
				s = s + str.charAt(i);
			}
		}
		return s;
	}

}

package classandobject;

public class StaticAndNonStaticKeyword {
	static int a;
	int b;
	
	static void print() {
		StaticAndNonStaticKeyword s = new StaticAndNonStaticKeyword();
		System.out.println(a);
		System.out.println(s.b);
	}
	
	void printDetail() {
		System.out.println(b);
		System.out.println(a);
	}

	public static void main(String[] args) {
		

	}

}

class Test {
	static int c;
	int d;
	
	static void print() {
		Test t = new Test();
		System.out.println(c);
		System.out.println(t.d);
		StaticAndNonStaticKeyword s = new StaticAndNonStaticKeyword();
		System.out.println(StaticAndNonStaticKeyword.a);
		System.out.println(s.b);
	}
	
	void printDetail() {
		System.out.println(c);
		System.out.println(d);
		StaticAndNonStaticKeyword s = new StaticAndNonStaticKeyword();
		System.out.println(StaticAndNonStaticKeyword.a);
		System.out.println(s.b);
	}
}

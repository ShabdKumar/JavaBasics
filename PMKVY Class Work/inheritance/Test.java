package inheritance;

interface flyable {
	String fly = "flying";
	default void flyabl() {
		System.out.println("interface");
	}
}

class Aeroplane {

	public void flya() {
		System.out.println("hi");
		
	}
	
}

public class Test extends Aeroplane implements flyable {
	public static void main(String[] args) {
		Test a = new Test();
		a.flya();
		a.flyabl();
		
	}

	/*@Override
	public void flyabl() {
		System.out.println("flyable");
		
	}*/
}

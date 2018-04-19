package inheritance;

@SuppressWarnings("serial")
class InvalidPinException extends Exception {
	String msg;
	InvalidPinException(String msg) {
		this.msg = msg;
		System.out.println(msg);
	}
}

class ATM {
	final int PIN = 1212;
	void insertPin(int pin) throws InvalidPinException {
		if(PIN != pin)
			throw new InvalidPinException("Pin Incorrect.");
	}
}

public class ExceptionHandling {
	public static void main(String[] args) {
		ATM atm = new ATM();
		try {
			atm.insertPin(1234);
		} catch (InvalidPinException e) {
		}
	}
}

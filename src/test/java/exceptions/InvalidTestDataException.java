package exceptions;

public class InvalidTestDataException extends CalculatorTestException {
	public InvalidTestDataException(String message) {
		super(message);
	}

	public InvalidTestDataException() {
		super();
	}
}

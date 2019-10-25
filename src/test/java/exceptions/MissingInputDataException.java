package exceptions;

public class MissingInputDataException extends CalculatorTestException {
	public MissingInputDataException() {
		super();
	}

	public MissingInputDataException(String message) {
		super(message);
	}
}

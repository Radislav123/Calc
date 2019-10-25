package cases;

import calculator.Divider;
import calculatorexceptions.InvalidInputDataException;

import static org.junit.jupiter.api.Assertions.*;
import static steps.Steps.*;

public class Cases {

	public static void divisionTestCase(String data, double expectedResult) throws InvalidInputDataException {
		Divider divider = validDataConstructor(data);
		countResult(divider);
		checkResult(divider, expectedResult);
		//todo: сделать так, чтобы тест падал, когда шаги не доходят до конца
	}


	public static void invalidTestDataCase(String invalidData) {
		assertFalse(invalidDataConstructor(invalidData));
	}
}

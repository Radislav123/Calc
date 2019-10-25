package steps;

import calculator.Divider;
import calculatorexceptions.InvalidInputDataException;
import io.qameta.allure.Step;

import static org.junit.jupiter.api.Assertions.*;
import static service.Service.dividerConstructor;

public class Steps {

	@Step("Create Divider with valid input")
	public static Divider validDataConstructor(String data) throws InvalidInputDataException {
		return dividerConstructor(data);
	}

	@Step("Count result")
	public static void countResult(Divider divider) {
		divider.count();
	}

	@Step("Check result")
	public static void checkResult(Divider divider, double expectedResult) {
		double delta = Math.pow(10, -12);
		divider.count();
		assertEquals(expectedResult, divider.getResult(), delta);
	}

	@Step("Try to create Divider with invalid input")
	public static boolean invalidDataConstructor(String data) {
		try {
			dividerConstructor(data);
			return true; //(is data valid?) it should not return true with invalid input data
		} catch (InvalidInputDataException e) {
			return false;
		}
	}
}

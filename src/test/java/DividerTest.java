import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.lang.annotation.Annotation;
import static org.junit.jupiter.api.Assertions.*;

class DividerTest implements AfterEach, BeforeEach {


	@Override
	public Class<? extends Annotation> annotationType() {
		return null;
	}

	@BeforeEach
	void beforeEach(TestInfo testInfo) {
		System.out.println(testInfo.getDisplayName());
	}

	@AfterEach
	void afterEach() {
		String string = "=";
		for (int i = 0; i < 23; i ++)
			string = string.concat("=");
		System.out.println(string + "\n");
	}

	@DisplayName("zero by zero division test")
	@Test
	void zeroByZeroDivisionTest() {
		float operand1 = 0;
		float operand2 = 0;
		assertTrue(Float.isNaN(Divider.count(operand1, operand2)));
	}

	@DisplayName("test set 1")
	@ParameterizedTest(name = "{index} test in the 1 test set")
	@ValueSource(floats = {-2, 0, 2})
	void countTest1(float operand1) {
		float operand2 = -2;
		assertTrue(operand1 / operand2 == Divider.count(operand1, operand2));
	}

	@DisplayName("test set 2")
	@ParameterizedTest(name = "{index} test in the 2 test set")
	@ValueSource(floats = {-2, 2})
	void countTest2(float operand1) {
		float operand2 = 0;
		assertTrue(operand1 / operand2 == Divider.count(operand1, operand2));
	}

	@DisplayName("test set 3")
	@ParameterizedTest(name = "{index} test in the 3 test set")
	@ValueSource(floats = {-2, 0, 2})
	void countTest3(float operand1) {
		float operand2 = 2;
		assertTrue(operand1 / operand2 == Divider.count(operand1, operand2));
	}
}
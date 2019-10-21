import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.lang.annotation.Annotation;

class DividerTest implements BeforeEach, AfterEach {


	@Override
	public Class<? extends Annotation> annotationType() {
		return null;
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("beforeEach");
	}

	@AfterEach
	void afterEach() {
		System.out.println("afterEach");
	}

	@ParameterizedTest
	@ValueSource(floats = {-2, 0, 2})
	void countTest1(float operand1) {
		float operand2 = -2;
		System.out.println(operand1 + " / " + operand2);
		System.out.println("response = " + Divider.count(operand1, operand2));
	}

	@ParameterizedTest
	@ValueSource(floats = {-2, 0, 2})
	void countTest2(float operand1) {
		float operand2 = 0;
		System.out.println(operand1 + " / " + operand2);
		System.out.println("response = " + Divider.count(operand1, operand2));
	}

	@ParameterizedTest
	@ValueSource(floats = {-2, 0, 2})
	void countTest3(float operand1) {
		float operand2 = 2;
		System.out.println(operand1 + " / " + operand2);
		System.out.println("response = " + Divider.count(operand1, operand2));
	}
}
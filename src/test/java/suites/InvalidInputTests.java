package suites;

import exceptions.InvalidTestDataException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;

import static cases.Cases.*;
import static service.Service.readInvalidInputData;


@DisplayName("Invalid input tests")
class InvalidInputTests {

	@TestFactory
	ArrayList<DynamicTest> dynamicNegativeTests() throws InvalidTestDataException {
		ArrayList<DynamicTest> tests = new ArrayList<>();
		ArrayList<String> data = new ArrayList<>();
		readInvalidInputData(data);
		for (int i = 0; i < data.size(); i++) {
			int index = i;
			String testName = String.format("Invalid input data {%s}", data.get(index));
			tests.add(DynamicTest.dynamicTest(testName, () -> invalidTestDataCase(data.get(index))));
		}
		return tests;
	}
}

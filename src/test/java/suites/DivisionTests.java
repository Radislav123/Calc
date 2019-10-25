package suites;

import exceptions.InvalidTestDataException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.DynamicTest;

import java.util.ArrayList;

import static cases.Cases.*;
import static service.Service.readDivisionData;


@DisplayName("Division tests")
class DivisionTests {

	@TestFactory
	ArrayList<DynamicTest> dynamicPositiveTests() throws InvalidTestDataException {
		ArrayList<DynamicTest> tests = new ArrayList<>();
		ArrayList<String> data = new ArrayList<>();
		ArrayList<Double> expectedResults = new ArrayList<>();
		readDivisionData(data, expectedResults);
		for (int i = 0; i < data.size(); i++) {
			int index = i;
			String testName = String.format("Divide {%s}, expect {%f}", data.get(index), expectedResults.get(index));
			tests.add(DynamicTest.dynamicTest(testName, () -> divisionTestCase(data.get(index), expectedResults.get(index))));
		}
		return tests;
	}

}

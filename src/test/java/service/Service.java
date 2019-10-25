package service;

import calculator.Divider;
import calculatorexceptions.InvalidInputDataException;
import exceptions.InvalidTestDataException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static constants.Constants.*;
import static org.junit.jupiter.api.Assertions.fail;

public class Service {

	public static Divider dividerConstructor(String data)throws InvalidInputDataException {
		return new Divider(data);
	}

	public static String createString(double value1, double value2) {
		return String.format("%f %f", value1, value2);
	}

	private static void readNextDouble(Scanner scanner, ArrayList<Double> arrayList) throws InvalidTestDataException {
		if (!scanner.hasNext())
			throw new InvalidTestDataException("(Can not find next token)");
		else
			arrayList.add(Double.valueOf(scanner.next()));
	}

	private static void readNextInvalidInputData(Scanner scanner, ArrayList<String> invalidData) throws InvalidTestDataException {
		if (!scanner.hasNext())
			throw new InvalidTestDataException("(Can not find next token)");
		else
			invalidData.add(scanner.next().trim());
	}

	public static void readDivisionData(ArrayList<String> data, ArrayList<Double> expectedResult) throws InvalidTestDataException {
		try {
			Scanner lineScanner = new Scanner(new File(DIVISION_TEST_DATA_PATH)).useDelimiter(DATA_DELIMITER);
			lineScanner.nextLine();
			while (lineScanner.hasNext()) {
				Scanner stringScanner = new Scanner(lineScanner.next()).useDelimiter(DIVISION_VALUE_DELIMITER);
				data.add(stringScanner.next().trim());
				readNextDouble(stringScanner, expectedResult);
			}
		} catch (FileNotFoundException e) {
			String message = e.getMessage() + "(Entry valid test data path)";
			System.err.println(message);
			fail(message);
		}
	}

	public static void readInvalidInputData(ArrayList<String> invalidData) throws InvalidTestDataException {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(INVALID_INPUT_TEST_DATA_PATH)).useDelimiter(DATA_DELIMITER);
			scanner.nextLine();
		} catch (FileNotFoundException e) {
			String message = e.getMessage() + "(Entry valid test data path)";
			System.err.println(message);
			fail(message);
		}
		while (scanner.hasNext())
			readNextInvalidInputData(scanner, invalidData);
	}
}

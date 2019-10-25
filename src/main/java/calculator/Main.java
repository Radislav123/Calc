package calculator;

import calculatorexceptions.InvalidInputDataException;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		System.out.println("Please entry two numbers (dividend and divisor) with only \" \" (space) separator.");
		Scanner scanner = new Scanner(System.in);
		try {
			Divider divider = new Divider(scanner.nextLine());
			divider.count();
			System.out.println("Result : " + divider.getResult());
		} catch (InvalidInputDataException e) {
			System.err.println(e.getMessage());
		}
		scanner.close();
	}
}

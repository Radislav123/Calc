package calculator;

import calculatorexceptions.InvalidInputDataException;

import java.util.Scanner;


public class Divider {
	private double dividend;
	private double divisor;
	private double result;

	public Divider(String data) throws InvalidInputDataException {
		Scanner scanner = new Scanner(data);
		if (!scanner.hasNextDouble())
			throw new InvalidInputDataException();
		this.dividend = scanner.nextDouble();
		if (!scanner.hasNextDouble())
			throw new InvalidInputDataException();
		this.divisor = scanner.nextDouble();
	}

	public void count() {
		this.result = this.dividend / this.divisor;
	}

	public double getDividend() {
		return dividend;
	}

	public double getDivisor() {
		return divisor;
	}

	public double getResult() {
		return result;
	}

	@Override
	public String toString() {
		return String.format("%f / %f", this.dividend, this.divisor);
	}
}

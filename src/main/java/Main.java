import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please entry two numbers (dividend and divisor) with only \" \" (space) separator.");
        float result = Divider.count(scanner.nextFloat(), scanner.nextFloat());
        System.out.println("Result : " + result);
    }
}

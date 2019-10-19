

public class Divider {

    public Divider(float operand1, float operand2) {
        if (operand2 == 0)
            System.out.println("Zero division.");
        System.out.println(operand1 / operand2);
    }
}

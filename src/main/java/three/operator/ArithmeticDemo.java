package three.operator;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("Prvi broj: ");
        double x = new Scanner(System.in).nextDouble();
        System.out.println("Drugi broj: ");
        double y = new Scanner(System.in).nextDouble();
        double sum = x + y;
        System.out.println("Suma: " + sum);
        double razlika = x - y;
        System.out.println("Razlika: " + razlika);
        double mnozenje = (int) (x * y);
        System.out.println("Mnozenje: " + mnozenje);
        double dijeljenje = x / y;
        System.out.println("Dijeljenje: " + dijeljenje);

    }
}

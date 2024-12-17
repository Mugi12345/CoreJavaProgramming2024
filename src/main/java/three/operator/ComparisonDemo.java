package three.operator;

import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int y = new Scanner(System.in).nextInt();
        if (x == y) {
            System.out.println("isti brojevi");
        }
        if (x != y) {
            System.out.println("razliciti brojevi");
        }
        if (x > y) {
            System.out.println("x vece od y");
        }
        if (x < y) {
            System.out.println("x manje od y");
        }

    }
}

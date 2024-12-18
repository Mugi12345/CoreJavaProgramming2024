package three.operator;

import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        System.out.println("First number: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Second number: ");
        int y = new Scanner(System.in).nextInt();
        if (x == 5 || x < y) {
            System.out.println("Condition is fulfilled!");
        }
        if (x == 4 && x > y) {
            System.out.println("Second condition is fulfilled");
        }

    }
}

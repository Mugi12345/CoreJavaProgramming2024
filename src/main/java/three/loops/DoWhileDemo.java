package three.loops;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj: ");
        int broj = new Scanner(System.in).nextInt();

        do {
            System.out.println(broj);
            break;
        }while (broj < 5);

    }
}

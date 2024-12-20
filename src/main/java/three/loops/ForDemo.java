package three.loops;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj: ");
        int x = new Scanner(System.in).nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println(i);
        }
    }
}

package three.loops;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj: ");
        int broj = new Scanner(System.in).nextInt();
        while (broj < 5){
            System.out.println("U redu je. ");
            //broj++;
            break;

        }
    }
}

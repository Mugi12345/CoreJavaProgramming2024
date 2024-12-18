package three.flow;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        char score;
        System.out.println("Unesite broj bodova: ");
        int mark = new Scanner(System.in).nextInt();
        System.out.println("Ocjena koju ste dobili je: ");
        if (mark <= 20){
            score = 'E';
        } else if (mark <= 40 ) {
            score = 'D';
        } else if (mark <= 60) {
            score = 'C';
        } else if (mark <= 80) {
            score = 'B';
        } else if (mark<= 100) {
            score = 'A';
        }else {
            score = 'F';
        }
        String message = "Ocjena je: " + score;
        System.out.println(message);
    }
}

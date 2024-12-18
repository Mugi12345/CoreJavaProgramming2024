package three.operator;

import java.util.Scanner;

public class ConditionalDemo2 {
    public static void main(String[] args) {
        String ime = new Scanner(System.in).nextLine();
        String result = "Filip".equals(ime) ? "Uneseno je ispravno ime." : "Pogresno unijeto ime";
        System.out.println(result);
    }
}

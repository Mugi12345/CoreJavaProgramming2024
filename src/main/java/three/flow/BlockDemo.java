package three.flow;

import java.util.Scanner;

public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("Unesi tekst: ");
        String tekst = new Scanner(System.in).nextLine();
        int lenght = tekst.length();
        if (lenght > 5){
            System.out.println("U redu je");
        }else {
            System.out.println("prekratko");
        }



    }
}

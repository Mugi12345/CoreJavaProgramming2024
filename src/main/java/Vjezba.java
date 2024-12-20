import java.util.Scanner;

public class Vjezba {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int y = new Scanner(System.in).nextInt();

        int remainder = x % y;
//        switch (remainder){
//            case 0 -> System.out.println("Nema ostatka");
//            default -> {
//                if (remainder >= 1000){
//                    System.out.println("Ostatak je veci od 1000 ");
//                }else {
//                    System.out.println("Ostatak je manji od 1000");
//                }
//            }
        if (remainder >= 1000) {
            System.out.println("Ostatak je veci od 1000 ");
        } else if (remainder == 0) {
            System.out.println("Ostatka nema");
        } else {
            System.out.println("Ostatak je manji od 1000");
        }
    }
}


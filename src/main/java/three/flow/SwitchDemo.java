package three.flow;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj za dana u nedelji: ");
        int redniBroj = new Scanner(System.in).nextInt();
        String danUNedelji;

        switch (redniBroj) {
            case 1:
                danUNedelji = "Monday";
                break;
            case 2:
                danUNedelji = "Tuesday";
                break;
            case 3:
                danUNedelji = "Wednesday";
                break;
            case 4:
                danUNedelji = "Thrusday";
                break;
            case 5:
                danUNedelji = "Friday";
                break;
            case 6:
                danUNedelji = "Saturday";
                break;
            case 7:
                danUNedelji = "Sunday";
                break;
            default:
                danUNedelji = "Pogresan broj.";
                break;
        }
        String message = "Za broj " + redniBroj + " dan u nedelji je: " + danUNedelji;
        System.out.println(message);
    }
}

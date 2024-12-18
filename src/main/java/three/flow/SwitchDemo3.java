package three.flow;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        System.out.println("Unesi redni broj za mjesec");
        int month = new Scanner(System.in).nextInt();
        System.out.println("Unesi godinu");
        int year = new Scanner(System.in).nextInt();

        int noOfDaysInMonth;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                noOfDaysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                noOfDaysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    noOfDaysInMonth = 29;
                } else {
                    noOfDaysInMonth = 28;
                }
                break;
            default:
                noOfDaysInMonth = 0;
        }
        String message = "Broj dana u mjesecu je: " + noOfDaysInMonth;
        System.out.println(message);

    }
}

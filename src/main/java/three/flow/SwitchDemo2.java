package three.flow;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
//        System.out.println("Unesi broj za dan u nedelji: ");
//        int redniBroj = new Scanner(System.in).nextInt();
//        String dayNames = "";
//
//        switch (redniBroj) {
//            case 1:
//                dayNames = dayNames + "Monday";
//
//            case 2:
//                dayNames = dayNames +"Tuesday";
//
//            case 3:
//                dayNames = dayNames +"Wednesday";
//
//            case 4:
//                dayNames =dayNames + "Thrusday";
//
//            case 5:
//                dayNames = dayNames +"Friday";
//
//            case 6:
//                dayNames =dayNames + "Saturday";
//
//            case 7:
//                dayNames = dayNames +"Sunday";
//                break;
//            default:
//                dayNames = "Pogresan broj.";
//                break;
//        }
//
//        System.out.println(dayNames);
//    }
        System.out.println("Unesite ime dana u nedelji: ");
        String dayName = new Scanner(System.in).nextLine();
        int dan = 0;
        switch (dayName) {
            case "Monday":
                dan = 1;
                break;
            case "Tuesday":
                dan = 2;
                break;
            case "Wednesday":
                dan = 3;
                break;
            case "Thursday":
                dan = 4;
                break;
            case "Friday":
                dan = 5;
                break;
            case "Saturday":
                dan = 6;
                break;
            case "Sunday":
                dan = 7;
            default:
                System.out.println("Pogresno unijet dan.");

        }
        String message = "Za uneseni dan u nedelji redni broj je: " + dan;
        System.out.println(message);
        //System.out.println(dan);

    }
}

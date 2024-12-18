package three.flow;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesi broj za dana u nedelji: ");
        int redniBroj = new Scanner(System.in).nextInt();
        String dayNames = "";

        switch (redniBroj) {
            case 1:
                dayNames = dayNames + "Monday";

            case 2:
                dayNames = dayNames +"Tuesday";

            case 3:
                dayNames = dayNames +"Wednesday";

            case 4:
                dayNames =dayNames + "Thrusday";

            case 5:
                dayNames = dayNames +"Friday";

            case 6:
                dayNames =dayNames + "Saturday";

            case 7:
                dayNames = dayNames +"Sunday";
                break;
            default:
                dayNames = "Pogresan broj.";
                break;
        }

        System.out.println(dayNames);
    }
}

package three.array;

import java.util.Random;
import java.util.Scanner;

public class Vjezba4Demo {
    public static void main(String[] args) {
        int[] numbers = new int[11];
        Random randomNumber = new Random();
        int randomInt = randomNumber.nextInt(1000);
        System.out.println("Unesi broj: ");
        int userNumber = new Scanner(System.in).nextInt();


//        switch (userNumber){
//            case 1,2,3,4,5,6,7,8,9,10,20,60,100:
//                System.out.println("Broj je u tablici");
//                break;
//            default:
//                System.out.println("Broj nije u tablici");
//        }
        for (int i = 0; i < numbers.length; i++) {

            if (randomInt == userNumber) {
                System.out.println("Broj je u tablici");
                break;
            }

        }
        if (randomInt != userNumber) {
            System.out.println("Broj nije u tablici");
        }

    }
}

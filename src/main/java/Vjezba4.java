import java.util.Scanner;

public class Vjezba4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 60, 100};
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
            int broj = numbers[i];
            if (broj == userNumber) {
                System.out.println("Broj je u tablici");
                break;
            }

        }
        if (numbers[0] != userNumber) {
            System.out.println("Broj nije u tablici");
        }

    }
}

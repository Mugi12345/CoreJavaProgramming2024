public class Vjezba2 {
    public static void main(String[] args) {
        int doors = 5;
        String carMake = "BMW";

        switch (carMake) {
            case "BMW":
                /*inner switch*/
                switch (doors) {
                    case 3:
                        System.out.println("You drive a BMW with three doors.");
                        break;
                    case 4:
                        System.out.println("You drive a BMW with four doors.");
                        break;
                    case 5:
                        System.out.println("You drive a BMW with five doors.");
                        break;
                }
                break;
            default:    /*this default belongs to outer switch*/
                System.out.println("We're sorry. You do not drive a BMW car.");
                break;
        }
    }
}

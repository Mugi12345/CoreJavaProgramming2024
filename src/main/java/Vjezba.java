public class Vjezba {
    public static void main(String[] args) {
        int x = 523134;
        int y = 325423;

        int remainder = x % y;
        switch (remainder){
            case 0 -> System.out.println("Nema ostatka");
            default -> {
                if (remainder >= 1000){
                    System.out.println("Ostatak je veci od 1000 ");
                }else {
                    System.out.println("Ostatak je manji od 1000");
                }
            }
        }
    }
}

package three.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int number = 23;
        number = 24;
        number = 25;

        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 24;
        numbers[2] = 25;

        for (int i = 0; i < numbers.length; i++) {
            int broj = numbers[i];
            System.out.println(broj);
        }
        System.out.println();

        double[] doubleNumbers = {23.0, 24.0, 25.0};
        for (int i = 0; i < doubleNumbers.length; i++) {
            double broj = doubleNumbers[i];
            System.out.println(broj);
        }
        System.out.println();
        //String[] names = {"Filip", "Milica", "Tea"};
        String[] names = new String[3];
        names[0] = "Filip";
        names[1] = "Milica";
        names[2] = "Tea";
//        for (int i = 0; i < names.length; i++) {
//            String name = names[i];
//            System.out.println(ime);
//        }
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            String ime = names[i];
            System.out.println(ime);
        }
    }
}

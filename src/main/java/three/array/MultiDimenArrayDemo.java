package three.array;

public class MultiDimenArrayDemo {
    public static void main(String[] args) {
//        String[][] names = {
//                {"Filip", "Andrija"},
//                {"Mugosa", "Milosevic"},
//        };
//        String fullName = names[0][0] + " " + names[1][1];
//        String fullName2 = names[0][1] + " " + names[1][0];
//        System.out.println(fullName);
//        System.out.println(fullName2);


        String[][] names = new String[2][2];
        names[0][0] = "Filip";
        names[0][1] = "Andrija";
        names[1][0] = "Mugosa";
        names[1][1] = "Milosevic";
        String fullName = names[0][0] + " " + names[1][1];
        System.out.println( fullName);
    }
}

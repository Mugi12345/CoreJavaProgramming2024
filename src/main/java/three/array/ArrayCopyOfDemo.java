package three.array;

import java.util.Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'a', 'b', 'c', 'a','i','r','p','l','a','n','e','s','r','k'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 3, 11);
        System.out.println(copyTo);
    }
}

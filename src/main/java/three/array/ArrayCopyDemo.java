package three.array;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'a', 'b', 'c', 'a','i','r','p','l','a','n','e','s','r','k'};
        char[] copyTo = new char[9];
        System.arraycopy(copyFrom,3,copyTo,0, copyTo.length);
        System.out.println(copyTo);
    }
}

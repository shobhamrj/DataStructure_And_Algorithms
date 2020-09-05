public class KthBitSetOrNot {

    public static void main(String[] args) {
        System.out.println(isSet(6,1));
    }

    private static boolean isSet(int n, int k) {
        int mask = 1 << (k - 1);
        return (mask & n) != 0;
    }
}

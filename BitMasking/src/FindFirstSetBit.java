public class FindFirstSetBit {

    public static void main(String[] args) {
        System.out.println(isSet(64));
    }

    private static int isSet(int n) {
        int count = 1;
        while (n > 0) {
            if ((n & 1) != 0)
                return count;
            n >>= 1;
            count++;
        }
        return count;
    }


}

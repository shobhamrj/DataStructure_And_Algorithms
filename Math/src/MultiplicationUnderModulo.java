public class MultiplicationUnderModulo {

    public static void main(String[] args) {
        long a = 1000000007;
        long b = 1000000089;
        System.out.println(cal(a, b));
    }

    private static long cal(long a, long b) {
        int M=1000000007;
        return ((a%M) * (b%M)) % M;
    }
}

public class MultiplicationUnderModulo {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        System.out.println(cal(a, b));
    }

    private static int cal(int a, int b) {
        int M=1000000007;
        return ((a%M) * (b%M)) % M;
    }
}

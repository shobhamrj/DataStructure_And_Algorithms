public class AdditionUnderModulo {

    public static void main(String[] args) {
        long a = 1000000007;
        long b = 1000000923;
        System.out.println(sumUnderModulo(a, b));
    }

    public static long sumUnderModulo(long a, long b){
        int M=1000000007;
        return (a%M + b%M) % M;
    }
}

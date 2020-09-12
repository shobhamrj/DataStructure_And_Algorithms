public class LogBase2 {

    public static void main(String[] args) {
        System.out.println(cal(18));
    }

    private static int cal(int n) {
        return n == 1 ? 0 : 1 +cal(n/2);
    }
}
//result gives floor(log2n)

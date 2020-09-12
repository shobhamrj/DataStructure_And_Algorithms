public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sum(9999));
    }

    private static int sum(int n) {
        return (n < 10) ? n : sum(n/10) + (n % 10);
    }

}

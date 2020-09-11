public class TrailingZerosInFactorial {

    public static void main(String[] args) {
        System.out.println(cal(100));
    }

    private static int cal(int n) {
        int result = 0;
        for (int i = 5; i <= n; i = i*5)
            result = result + (n/i);
        return result;
    }
}
/*
time complexity =
5^k <= n
k <= log n  (log base 5)
therefore time complexity = O(log n)

 */

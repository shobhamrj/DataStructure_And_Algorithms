public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    private static int fib(int n) {
        return (n <= 1) ? n : fib(n - 1) + fib(n - 2);
    }
// time complexity : O(2^(n)), space complexity : O(n)

}

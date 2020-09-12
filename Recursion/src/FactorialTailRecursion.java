public class FactorialTailRecursion {

    public static void main(String[] args) {
        System.out.println(fact(5, 1));
    }

    private static int fact(int n, int k) {
        return (n == 0 || n ==1)? k : fact(n - 1, k * n);
    }
    // to make this code a tail recursive i h ave added k = 1, an extra parameter (initialize k to 1 every time)

    //// time complexity : O(n), space complexity : O(n)

}

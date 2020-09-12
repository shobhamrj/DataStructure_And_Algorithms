public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    private static int sum(int n) {
        return (n == 0) ? 0 : n + sum(n - 1);
    }

}// time complexity : O(n), space complexity : O(n)

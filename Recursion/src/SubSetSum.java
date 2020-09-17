public class SubSetSum {

    public static void main(String[] args) {
        int[] arr = {10, 20, 15};
        int sum = 25;
        System.out.println(countSubSet(arr, arr.length, sum));
    }

    private static int countSubSet(int[] arr, int n, int sum) {
        if(n == 0) return (sum == 0)? 1 : 0;
        return countSubSet(arr, n - 1, sum) + countSubSet(arr, n - 1, sum - arr[n - 1]);
    }
}
//  Total calls made 2^(n) + 2^(n - 1), Therefore,
// Time Complexity : 2^(n)


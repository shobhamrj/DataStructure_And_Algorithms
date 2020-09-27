public class   MaxSumSubArray {

    public static void main(String[] args) {
        int[] array = {2, 3, -8, 7, -1, 2, 3}; // 11
        int[] array1 = {5, 8, 3}; // 16
        int[] array2 = {-6, -1, -8}; // -1
        int[] array3 = {1, -2, 3, -1, 2}; //4
        int[] array4 = {-3, 8, -2, 4, -5, 6}; //11
        System.out.println(maxSum(array));
        System.out.println(maxSum(array1));
        System.out.println(maxSum(array2));
        System.out.println(maxSum(array3));
        System.out.println(maxSum(array4));
    }

    private static int maxSum(int[] arr) {
        int maxTillHere = arr[0];
        int res = arr[0];
        for(int i = 1; i < arr.length; i++) {
            maxTillHere = Math.max(arr[i], maxTillHere + arr[i]);
            res  = Math.max(res, maxTillHere);
        }
        return res;
    }
} // time complexity O(n)

/*
 a naive solution of time complexity O(n^2) in worst case

    private static int maxSum(int[] arr) {
        // simple idea is to generate all possible sub arrays and check maximum from those sub arrays
        int res = arr[0];
        for(int i = 0; i < arr.length; i++) {
            int curr = 0;
            for(int j = i; j < arr.length; j++) {
                curr = curr + arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }
 */

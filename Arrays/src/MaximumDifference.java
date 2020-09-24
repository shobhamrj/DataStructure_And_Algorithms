public class MaximumDifference {

    private static int[] array = {2, 3, 10, 6, 4, 8, 1};
    private static int[] array1 = {7, 9, 5, 6, 3, 2};
    private static int[] array2 = {10, 20, 30};
    private static int[] array3 = {30, 10, 8, 2};

    public static void main(String[] args) {
        System.out.println(maxDiff(array));
        System.out.println(maxDiff(array1));
        System.out.println(maxDiff(array2));
        System.out.println(maxDiff(array3));
        
    }

    //find Max Value in array such that arr[j] - arr[i] such that j > i
    private static int maxDiff(int[] arr) {
        int res = arr[1] - arr[0];
        int minValue = arr[0];
        for(int j = 1; j < arr.length; j++) {
            res = Math.max(res, arr[j] - minValue);
            minValue = Math.min(minValue, arr[j]);
        }
        return res;
    }
}// Time complexity: O(n)


/*
A naive solution of time complexity O(n^2)

    private static int maxDiff(int[] arr) {
        int res = arr[1] - arr[0];
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++)
                res = Math.max(res, arr[j] - arr[i]);
        }
        return res;
    }
 */

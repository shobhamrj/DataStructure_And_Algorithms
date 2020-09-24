public class MaximumConsecutive1sInABinaryArray {

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 0};
        int[] array1 = {1, 1, 1, 1};
        int[] array2 = {0, 0, 0, 0};
        int[] array3 = {1, 0, 1, 1, 1, 1, 0, 1, 1};
        System.out.println(maxOnes(array));
        System.out.println(maxOnes(array1));
        System.out.println(maxOnes(array2));
        System.out.println(maxOnes(array3));
    }

    private static int maxOnes(int[] arr) {
        int res = 0;
        int curr = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                curr = 0;
            }
            else {
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }


}// Time Complexity: O(n)


/*
 a naive solution of time complexity O(n^2) in worst case

     private static int maxOnes(int[] arr) {
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int curr = 0;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] == 1)
                    curr++;
                else
                    break;
            }
            res = Math.max(res, curr);
        }
        return res;
    }
 */

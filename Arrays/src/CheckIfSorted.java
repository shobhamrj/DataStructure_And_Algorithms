public class CheckIfSorted {
    public static void main(String[] args) {
        int[] array = {5,6,3,7,9,8};
        int[] array2 = {5,6,7,8,9,10};
        int[] array3 = {1, 1};
        System.out.println(isSorted(array));
        System.out.println(isSorted(array2));
        System.out.println(isSorted(array3));
    }

    private static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
}
//Time complexity: O(n)

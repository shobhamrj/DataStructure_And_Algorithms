public class LargestElement {

    private static int[] array = {2, 3, 10, 6, 4, 8, 1};
    private static int[] array1 = {7, 9, 5, 6, 3, 2};
    private static int[] array2 = {10, 20, 30};
    private static int[] array3 = {30, 10, 8, 2};

    public static void main(String[] args) {
        System.out.println(arrayMax(array));
        System.out.println(arrayMax(array1));
        System.out.println(arrayMax(array2));
        System.out.println(arrayMax(array3));
    }

    private static int arrayMax(int[] arr) {
        int res = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[res] < arr[i])
                res = i;
        }
        return res;
    }
}
// returns the index of largest element
// time complexity: O(n)

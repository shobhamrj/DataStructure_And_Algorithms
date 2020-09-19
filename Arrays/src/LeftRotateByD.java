import java.util.Arrays;

public class LeftRotateByD {

    private static int[] array = {5, 6, 3, 7, 9, 8};
    private static int[] array2 = {5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        rotateByD(array, 5);
        rotateByD(array2, 4);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }

    private static int[] rotateByD(int[] arr, int d) {
        rev(arr, 0, d - 1);
        rev(arr, d, arr.length - 1);
        rev(arr, 0, arr.length - 1);
        return arr;
    }

    private static int[] rev(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        return arr;
    }
} // time complexity: O(n) and auxiliary space: O(1)


/*
time complexity: O(n*d)
Naive solution by calling left rotate d times.

    private static void leftByD(int[] array, int d)  {
        for(int i = 1; i <= d; i++)
            rotate(array);

    }

    private static int[] rotate(int[] arr) {
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++)
            arr[i - 1] = arr[i];
        arr[arr.length - 1] = temp;
        return arr;
    }

 */

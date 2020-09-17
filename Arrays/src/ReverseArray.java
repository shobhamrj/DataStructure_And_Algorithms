import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {5,6,3,7,9,8};
        int[] array2 = {5,6,7,8,9,10};
        int[] array3 = {1};
        rev(array);
        rev(array2);
        rev(array3);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }

    private static int[] rev(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        return arr;
    }
}
// Time Complexity: O(n/2)

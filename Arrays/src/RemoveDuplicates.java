import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 4, 4, 7, 8, 8, 10};
        int n = remove(array, array.length);
        System.out.println(Arrays.toString(array));
        System.out.println("Above array is sorted till " + (n-1) + "th index.");
    }

    private static int remove(int[] arr, int size) {
        int result = 1;
        for(int i = 1; i < size; i++) {
            if(arr[i] != arr[result - 1]) {
                arr[result] = arr[i];
                result ++;
            }
        }
        return result;
    }
}
//time Complexity: O(n)


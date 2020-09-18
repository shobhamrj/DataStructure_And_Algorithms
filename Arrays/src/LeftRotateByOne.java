import java.util.Arrays;

public class LeftRotateByOne {

    private static int[] array = {5, 6, 3, 7, 9, 8};
    private static int[] array2 = {5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int[] array = {5, 6, 3, 7, 9, 8};
        int[] array2 = {5, 6, 7, 8, 9, 10};
        rotate(array);
        rotate(array2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }

    private static int[] rotate(int[] arr) {
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++)
            arr[i - 1] = arr[i];
        arr[arr.length - 1] = temp;
        return arr;
    }
}
//time Complexity: O(n)

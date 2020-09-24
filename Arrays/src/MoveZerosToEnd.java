import java.util.Arrays;

public class MoveZerosToEnd {

    private static int[] array = {8, 5, 0, 10, 0, 20};
    private static int[] array1 = {0, 0, 0, 10, 0};
    private static int[] array2 = {10, 20};

    public static void main(String[] args) {
        moveZeros(array);
        moveZeros(array1);
        moveZeros(array2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    private static int[] moveZeros(int[] arr) {
        int countNonZeroElement = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[countNonZeroElement];   //swap(arr[i], arr[countNonZeroElement])
                arr[countNonZeroElement] = temp;
                countNonZeroElement++;
            }
        }
        return arr;
    }
}
// Time complexity: O(n)

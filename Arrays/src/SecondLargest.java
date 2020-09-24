public class SecondLargest {

    private static int[] array = {2, 3, 10, 6, 4, 8, 1};
    private static int[] array1 = {7, 9, 5, 6, 3, 2};
    private static int[] array2 = {10, 20, 30};
    private static int[] array3 = {30, 100, 8, 2};

    public static void main(String[] args) {
        System.out.println(arrayMax2(array));
        System.out.println(arrayMax2(array1));
        System.out.println(arrayMax2(array2));
        System.out.println(arrayMax2(array3));
    }

    private static int arrayMax2(int[] arr) {
        int res = -1;
        int largest = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            }
            else if(arr[i] != largest) {
                if(res == -1 || arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }
}
// returns the index of 2nd largest element
// time complexity: O(n)
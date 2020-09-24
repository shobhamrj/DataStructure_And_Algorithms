public class FrequencySortedArray {

    private static int[] array = {10, 10, 10, 25 ,30};
    private static int[] array1 = {10, 10, 10, 10};
    private static int[] array2 = {10, 20, 30};

    public static void main(String[] args) {
        findFrequency(array);
        System.out.println();
        findFrequency(array1);
        System.out.println();
        findFrequency(array2);
        System.out.println();
    }

    private static void findFrequency(int[] arr) {
        int i = 1;
        int freq = 1;
        while (i <= arr.length) {
            while (i < arr.length && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + ": " + freq);
            i++;
            freq = 1;
        }
    }
}
//Time complexity: O(n)
// dont be mistaken with two while loops, see clearly we are traversing the array only once
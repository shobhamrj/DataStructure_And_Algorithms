public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {5,6,3,7,9,8};
        int x = 8;
        System.out.println(search(array, x));
    }

    private static int search(int[] array, int x) {
        for(int i = 0; i < array.length; i++)
            if(array[i] == x)
                return i;
        return -1;
    }
}
//Time complexity: O(n)


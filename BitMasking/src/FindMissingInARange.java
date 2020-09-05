public class FindMissingInARange {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,7};
        System.out.println(findMissing(array));
    }

    private static int findMissing(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++)
            res ^= array[i];
        for (int i = 1; i <= array.length + 1; i++)
            res ^= i;
        return res;
    }
}

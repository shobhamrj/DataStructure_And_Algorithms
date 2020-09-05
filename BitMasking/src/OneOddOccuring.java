public class OneOddOccuring {

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,3,3,5,5,7,7,7,7,8,8,8,8,8,8,10};
        System.out.println(firstOddOccur(array));
    }

    private static int firstOddOccur(int[] array) {
        int res = 0;
        for(int i = 0; i < array.length; i++) {
            res ^= array[i];
        }
        return res;
    }
}

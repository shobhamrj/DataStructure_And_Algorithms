public class TrappingRainWater {

    private static int[] array = {2, 0, 2};
    private static int[] array1 = {3, 0, 1, 2, 5};

    public static void main(String[] args) {
        System.out.println(trapWater(array));
        System.out.println(trapWater(array1));
    }

    private static int trapWater(int[] arr) {
        int res = 0;

        int[] lMax = new int[arr.length];
        lMax[0] = arr[0];
        for(int i = 1; i < lMax.length; i++)
            lMax[i] = Math.max(arr[i], lMax[i - 1]);

        int[] rMax = new int[arr.length];
        rMax[arr.length - 1] = arr[arr.length - 1];
        for(int i = rMax.length - 2; i >= 0; i--)
            rMax[i] = Math.max(arr[i], rMax[i + 1]);

        for(int i = 1; i < arr.length - 1; i++)
            res += (Math.min(lMax[i], rMax[i])) - arr[i];
        return res;
    }
    //Time Complexity: O(n)
    //Auxiliary space: O(n)


}

/*
This is a naive algorithm for this problem
Time Complexity: O(n^2)

private static int trapWater(int[] arr) {
        int res = 0;
        for(int i = 1; i < arr.length - 1; i++){
            int lMax = arr[i];
            for(int j = 0; j < i; j++)
                lMax = Math.max(lMax, arr[j]);
            int rMax = arr[i];
            for(int j = i + 1; j < arr.length; j++)
                rMax = Math.max(rMax, arr[j]);
            res += Math.min(lMax, rMax) - arr[i];
        }
        return res;
    }
 */

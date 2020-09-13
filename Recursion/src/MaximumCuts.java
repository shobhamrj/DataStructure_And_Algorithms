public class MaximumCuts {

    public static void main(String[] args) {
        System.out.println(maxCut(23, 11, 9, 12));
        System.out.println(maxCut(5, 2, 1, 5));

    }

    private static int maxCut(int n, int a, int b, int c) {
        if(n == 0)
            return 0;
        if(n < 0)
            return -1;
        int result = Math.max( (Math.max(maxCut(n - a, a, b, c), maxCut(n - b, a, b, c))), maxCut(n - c, a, b, c) );
        if(result == -1)
            return -1;
        return result + 1;
    }
}
//Time Complexity : O(3^n)

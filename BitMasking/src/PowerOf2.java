public class PowerOf2 {

    public static void main(String[] args) {
        System.out.println(isPower2(8));
    }

    private static boolean isPower2(int n) {
        return (n != 0) && ((n & (n - 1))) == 0;
    }
}  //Brian Kernighan’s Algorithm, Time Complexity: O(logn)

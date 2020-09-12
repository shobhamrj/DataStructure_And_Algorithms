public class DecimalToBinary {

    public static void main(String[] args) {
        convert(1024);
    }

    private static void convert(int n) {
        if(n == 0)
            return;
        convert(n/2);
        System.out.print(n % 2 + " ");
    }
}
// for n > 0
// // time complexity : O(logn), space complexity : O(n/2) <-- nearly

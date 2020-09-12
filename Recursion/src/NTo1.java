public class NTo1 {

    public static void main(String[] args) {
        rec(100);
    }

    private static void rec(int n) {
        if(n == 0)
            return;
        System.out.print(n + " ");
        rec(n - 1);
    }


}

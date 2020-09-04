public class Factorial {

    public static void main(String[] args) {
        System.out.println(cal(10));
    }

    private static int cal(int n) {
        int fact = 1;
        for(int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }
}

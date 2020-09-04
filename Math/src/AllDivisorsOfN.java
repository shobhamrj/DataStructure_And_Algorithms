public class AllDivisorsOfN {

    public static void main(String[] args) {
        printDivisors(123);
    }

    private static void printDivisors(int n) {
        int i;
        for (i = 1; i * i < n; i++) {
            if(n % i == 0)
                System.out.print(i + " ");
        }
        for( ; i >= 1; i--){
            if(n % i == 0)
                System.out.print(n/i + " ");
        }
    }
}

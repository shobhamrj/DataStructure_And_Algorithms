// Optimized version of this code : O(sqrt(n))
public class PrimeFactors {

    public static void main(String[] args) {
        cal(450);
    }

    private static void cal(int n) {
        if(n < 0)
            return;
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n /= 3;
        }
        for(int i = 5; i * i <= n; i = i + 6) {
            while (n % i == 0) {
                System.out.print(i+" ");
                n /= i;
            }
            while (n % (i +2) == 0){
                System.out.println(i + 2 + " ");
                n /= i + 2;
            }
        }
        if(n > 3)
            System.out.print(n+ " ");
    }
}

public class Exactly3Divisors {

    public static void main(String[] args) {
        System.out.println(cal(6));
    }

    private static int cal(int n) {
        int count = 0;
        n = (int)Math.sqrt(n);
        for(int i = 1 ; i <= n; i++) {
            if(CheckForPrime.isPrime(i))
                count++;
        }
        return count;
    }
}  //O( N^(1/2) * N^(1/4) )

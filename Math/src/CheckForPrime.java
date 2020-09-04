public class CheckForPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }

    private static boolean isPrime (int n) {
        if(n == 1)
            return false;
        if(n == 2 || n == 3)
            return true;
        if(n % 2 == 0 || n % 3 == 0)
            return false;
        for(int i = 5; i * i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;

    }


}

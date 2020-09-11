public class LcmAndHcf {

    public static void main(String[] args) {
        int a = 6, b = 9;
        System.out.println("LCM is " + lcm(a, b) + ", GCD is " + gcd(a, b));
    }

    private static int gcd(int a, int b) {
        return (b == 0)? a : gcd(b, a%b);
    } // Time Complexity : O (log min(a, b))

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }  // Time Complexity : O (log min(a, b))


}

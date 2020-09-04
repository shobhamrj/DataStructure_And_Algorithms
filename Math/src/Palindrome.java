public class Palindrome {

    public static void main(String[] args) {
        System.out.println(cal(120));
    }

    private static boolean cal(int n) {
        int rev = 0;
        int temp = n;
        while(temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        return (rev == n)? true : false;
    }
}

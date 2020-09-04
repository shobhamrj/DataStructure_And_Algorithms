public class CountDigits {

    public static void main(String[] args) {
        System.out.println(cal(123456));
    }

    private static int cal(int a) {
        int count = 0;
        while(a != 0) {
            a /= 10;
            count++;
        }
        return count;
    }
}

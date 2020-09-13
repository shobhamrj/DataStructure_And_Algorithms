public class DigitalRoot {

    public static void main(String[] args) {
        System.out.println(digitalRoot(9999));
    }
    public static int digitalRoot(int n){
        int s = sum(n);
        return (s < 10) ? s : digitalRoot(s);
    }

    public static int sum(int n) {
        return (n < 10) ? n : sum(n/10) + (n % 10);
    }

}

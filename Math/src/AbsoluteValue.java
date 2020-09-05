public class AbsoluteValue {

    public static void main(String[] args) {
        System.out.println(absolute(22));
        System.out.println(absolute(-321));
    }

    private static int absolute(int n) {
        return (n < 0) ? n * -1 : n ;

    }
}

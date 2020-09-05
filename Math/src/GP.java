public class GP {

    public static void main(String[] args) {
        System.out.println(Math.floor(termOfGP(3, 9, 4)));
    }

    public static double termOfGP(int A,int B,int N) {
        return (double) ( A * Math.pow( (double) B/A , (N - 1)) );
    }
}

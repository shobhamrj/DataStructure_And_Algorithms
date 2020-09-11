public class AdditionUnderModulo {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 10;
        System.out.println(sumUnderModulo(a, b));
    }

    public static int sumUnderModulo(int a, int b){
        int M=1000000007;
        return (a%M + b%M) % M;
        //return (a + b) ;
    }

}

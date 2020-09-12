public class ModuloMultiplicativeInverse {

    public static void main(String[] args) {
        System.out.println(calInv(10, 20));
    }

    private static int calInv(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++)
            if ((a * x) % m == 1)
                return x;
        return 1;
    }


}

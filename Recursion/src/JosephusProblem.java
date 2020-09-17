public class JosephusProblem {

    public static void main(String[] args) {
        System.out.println(jos(5, 3));
    }

    private static int jos(int n, int k) {
        return n == 1 ? 0 : (jos(n - 1, k) + k) % n ;
    }
}
// T(n) = T(n - 1) + c
// Time Complexity : O(n)
// indices of people in a circle are considered from 0 here
// for more read the Josephus's problem statement
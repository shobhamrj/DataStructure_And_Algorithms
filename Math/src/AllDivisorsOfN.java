import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AllDivisorsOfN {

    public static void main(String[] args) {
        printDivisors(100);
    }

    private static void printDivisors(int n) {
        List<Integer> res = new ArrayList<>();
        int i;
        for (i = 1; i * i < n; i++) {
            if(n % i == 0)
                res.add(i);    //System.out.print(i + " ");
        }
        for( ; i >= 1; i--){
            if(n % i == 0)
                res.add(n/i);    //System.out.print(n/i + " ");
        }
        System.out.println(res.toString());
    }
} //Time Complexity: O(sqrt(n))

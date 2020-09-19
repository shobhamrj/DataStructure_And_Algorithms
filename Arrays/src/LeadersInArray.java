import java.util.Arrays;

public class LeadersInArray {

    private static int[] array = {7, 10, 4, 10, 6, 5, 2};
    private static int[] array2 = {5,6,7,8,9,10};

    public static void main(String[] args) {
        findLeader(array);
        System.out.println();
        findLeader(array2);
    }

    private static void findLeader(int[] array) {
        // this solution prints the array elements from right to left, Time Complexity: O(n)
        int currLeader = array[array.length - 1];
        System.out.print(currLeader + " ");
        for(int i = array.length - 2; i >= 0; i--){
            if(currLeader < array[i]) {
                currLeader = array[i];
                System.out.print(currLeader + " ");
            }
        }
    }
}


// Leader in array in an element where there is nothing greater then it, in the right side of the array.

/*

A naive solution of time complexity, O(n^2)

   private static void findLeader (int[] array) {
        for(int i = 0; i < array.length; i++) {
            boolean isLeader = true;
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] <= array[j]) {
                    isLeader = false;
                    break;
                }
            }
            if(isLeader == true)
                System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
 */
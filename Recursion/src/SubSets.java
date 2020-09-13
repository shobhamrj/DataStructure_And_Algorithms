public class SubSets {

    public static void main(String[] args) {
        findSubset("abc", " ", 0);
    }

    private static void findSubset(String str, String curr , int index ) {
        if(index == str.length()) {
            System.out.print(curr);
            return;
        }
        findSubset(str, curr, index + 1);
        findSubset(str, curr + str.charAt(index), index + 1);
    }
}//Time Complexity : O(2^n)


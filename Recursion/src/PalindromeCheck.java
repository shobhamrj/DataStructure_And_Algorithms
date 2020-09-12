public class PalindromeCheck {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abbcbba", 0, 6));
        System.out.println(isPalindrome("RADAR", 0, 4));
        System.out.println(isPalindrome("geek",0, 3));
        System.out.println(isPalindrome("abcd", 0, 3));
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if(start >= end)
            return true;
        return (s.charAt(start) == s.charAt(end)) && isPalindrome(s, start + 1, end - 1);
    }
}
// time complexity : O(n), space complexity : O(n) <-- nearly
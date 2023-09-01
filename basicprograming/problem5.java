public class problem5 {
    private static boolean palindrome(String value) {
        int left = 0;
        int right = value.length() - 1;
        while (left < right) {
            if (value.charAt(left) != value.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic")); // true
        System.out.println(palindrome("lion")); // false
    }
}
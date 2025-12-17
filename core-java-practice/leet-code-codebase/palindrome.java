
class Solution {

    // Method to check whether a number is palindrome or not
    public boolean isPalindrome(int x) {

        // Negative numbers and numbers ending with 0 (except 0 itself)
        // cannot be palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNumber = 0;

        // Reverse only half of the number
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x = x / 10;
        }

        // For even length: x == reversedNumber
        // For odd length: x == reversedNumber / 10
        return (x == reversedNumber || x == reversedNumber / 10);
    }

    // Main method to test the program
    public static void main(String[] args) {

        Solution obj = new Solution();

        int number = 121;

        if (obj.isPalindrome(number)) {
            System.out.println(number + " is a palindrome number");
        } else {
            System.out.println(number + " is not a palindrome number");
        }
    }
}

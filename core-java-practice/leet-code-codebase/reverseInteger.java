class Solution {

    // Method to reverse an integer number
    public int reverse(int x) {

        int revnum = 0;

        // Loop until the number becomes 0
        while (x != 0) {

            // Get last digit
            int digit = x % 10;

            // Check overflow for positive numbers
            if (revnum > Integer.MAX_VALUE / 10 ||
               (revnum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Check overflow for negative numbers
            if (revnum < Integer.MIN_VALUE / 10 ||
               (revnum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            // Update reversed number
            revnum = revnum * 10 + digit;

            // Remove last digit from original number
            x = x / 10;
        }

        return revnum;
    }

    // Main method for testing
    public static void main(String[] args) {

        Solution obj = new Solution();

        int number = 123;

        int result = obj.reverse(number);

        System.out.println("Reversed number is: " + result);
    }
}

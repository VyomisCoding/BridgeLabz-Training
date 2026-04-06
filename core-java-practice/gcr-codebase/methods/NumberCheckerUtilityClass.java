import java.util.*;
public class NumberCheckerUtilityClass {
	
	//COMMON METHODS ---------------------------------------------------------------------------------------------------------

    public static int countDigits(int num) {
        int temp = num, count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    public static int[] getDigits(int num) {
        int size = countDigits(num);
        int[] arr = new int[size];
        int index = size - 1;

        while (num > 0) {
            arr[index--] = num % 10;
            num /= 10;
        }
        return arr;
    }
    
    // FIRST SET ----------------------------------------------------------------------------------------------------------------------------
    public static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == num;
    }
    
    public static int[] largestAndSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
        }
        return new int[]{max1, max2};
    }
    
    public static int[] smallestAndSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1) {
                min2 = d;
            }
        }
        return new int[]{min1, min2};
    }

    // SECOND SET -----------------------------------------------------------------------------------------------------------------------------
    public static int sumOfDigits(int[] digits) {
        int s = 0;
        for (int d : digits) s += d;
        return s;
    }

    public static int sumOfSquares(int[] digits) {
        int s = 0;
        for (int d : digits) s += Math.pow(d, 2);
        return s;
    }

    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // THIRD SET ------------------------------------------------------------------------------------------------------------------------------
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static boolean isPalindrome(int[] digits) {
        return Arrays.equals(digits, reverseArray(digits));
    }

    // FOURTH SET -----------------------------------------------------------------------------------------------------------------------------

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static boolean isNeon(int num) {
        int sq = num * num;
        int sum = 0;

        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int[] digits) {
        int sum = 0, prod = 1;
        for (int d : digits) {
            sum += d;
            prod *= d;
        }
        return sum == prod;
    }
    
    public static boolean isAutomorphic(int num) {
        int sq = num * num;
        return String.valueOf(sq).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    // FIFTH SET ------------------------------------------------------------------------------------------------------------------------------

    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int num) {
        return sumOfProperDivisors(num) == num;
    }
    
    public static boolean isAbundant(int num) {
        return sumOfProperDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return sumOfProperDivisors(num) < num;
    }

    public static boolean isStrong(int num) {
        int sum = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) fact *= i;
            sum += fact;
            temp /= 10;
        }
        return sum == num;
    }

    // MAIN METHOD WITH USER INPUT --------------------------------------------------------------------------------------------------------------
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("\nDigits: " + Arrays.toString(digits));

        System.out.println("\n--- Number Properties ---");
        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong Number: " + isArmstrong(num, digits));
        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Harshad Number: " + isHarshad(num, digits));
        System.out.println("Prime Number: " + isPrime(num));
        System.out.println("Neon Number: " + isNeon(num));
        System.out.println("Spy Number: " + isSpy(digits));
        System.out.println("Automorphic Number: " + isAutomorphic(num));
        System.out.println("Buzz Number: " + isBuzz(num));

        System.out.println("\n--- Small/Large Digits ---");
        System.out.println("Largest & 2nd Largest: " + Arrays.toString(largestAndSecondLargest(digits)));
        System.out.println("Smallest & 2nd Smallest: " + Arrays.toString(smallestAndSecondSmallest(digits)));
        
        System.out.println("\n--- Perfect/Abundant/Deficient ---");
        System.out.println("Perfect Number: " + isPerfect(num));
        System.out.println("Abundant Number: " + isAbundant(num));
        System.out.println("Deficient Number: " + isDeficient(num));

        System.out.println("\nStrong Number: " + isStrong(num));
		
	}

}

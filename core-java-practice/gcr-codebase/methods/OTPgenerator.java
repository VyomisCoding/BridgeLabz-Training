import java.util.*;
public class OTPgenerator {
	public static int generateOTP() {
        return (int) (100000 + Math.random() * 900000);
    }

    public static boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		int[] otpList = new int[10];
        for (int i = 0; i < otpList.length; i++) {
            otpList[i] = generateOTP();
        }
        System.out.println("Generated OTPs: " + Arrays.toString(otpList));
        if (isUnique(otpList)) {
            System.out.println("All OTPs are unique");
        } else {
            System.out.println("Duplicate OTP found!");
        }

	}

}

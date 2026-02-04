interface SecurityUtils {

    // Static method to validate password strength
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&       // At least 1 uppercase
               password.matches(".*[a-z].*") &&       // At least 1 lowercase
               password.matches(".*\\d.*") &&         // At least 1 digit
               password.matches(".*[@#$%^&+=].*");    // At least 1 special character
    }
}

public class PasswordTest{
    public static void main(String[] args){
        String pwd = "Abcd@123";
        if(SecurityUtils.isStrongPassword(pwd)){
            System.out.println("Password is strong!");
        }else{
            System.out.println("Weak password!");
        }
    }
}

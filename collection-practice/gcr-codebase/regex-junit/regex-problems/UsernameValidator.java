public class UsernameValidator{
    public static boolean isValidUsername(String username){
        // Regex Breakdown: ^[A-Za-z](→ must start with a letter) [A-Za-z0-9_]{4,14}$ (→ remaining characters (total 5-15))
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args){
        String[] testUsernames = {"user_123", "123user", "us", "Vyom_2026"};
        for(String username : testUsernames){
            if(isValidUsername(username)){
                System.out.println(username + " → Valid");
            }else{
                System.out.println(username + " → Invalid");
            }
        }
    }
}

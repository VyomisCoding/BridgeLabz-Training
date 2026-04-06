public class HexColorValidator{
    public static boolean isValidHexColor(String color){
        String regex = "^#[A-Fa-f0-9]{6}$";        // ^# → must start with #  || [A-Fa-f0-9]{6}$ → exactly 6 hex characters
        return color.matches(regex);
    }

    public static void main(String[] args){
        String[] colors = {"#FFA500", "#ff4500", "#123", "#ZZZZZZ"};
        for(String c : colors){
            System.out.println(c + " → " + (isValidHexColor(c) ? "Valid" : "Invalid"));
        }
    }
}

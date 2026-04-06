public class LicensePlateValidator{
    public static boolean isValidPlate(String plate){
        String regex = "^[A-Z]{2}[0-9]{4}$";           // ^[A-Z]{2} → exactly 2 uppercase letters  ||  [0-9]{4}$ → exactly 4 digits
        return plate.matches(regex);
    }

    public static void main(String[] args){
        String[] plates = {"AB1234", "A12345", "XY9876"};
        for(String p : plates){
            System.out.println(p + " → " + (isValidPlate(p) ? "Valid" : "Invalid"));
        }
    }
}

public class LegacyAPI{
    @Deprecated
    void oldFeature(){
        System.out.println("Old feature - Do NOT use anymore!");
    }

    void newFeature(){
        System.out.println("New feature - Use this instead.");
    }

    public static void main(String[] args){
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();   // Deprecated method warning
        api.newFeature();   // Recommended new method
    }
}

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm=6378;
        double pi=3.14159;
        double volumeKm=(4.0/3.0)*pi*radiusKm*radiusKm*radiusKm;
        double kmToMiles=0.621371;
        double volumeMiles=volumeKm*kmToMiles*kmToMiles*kmToMiles;
        System.out.println("The Volume of Earth in Cubic Kilometers is " + volumeKm + " and in Cubic Miles is " + volumeMiles);
    }
    
}

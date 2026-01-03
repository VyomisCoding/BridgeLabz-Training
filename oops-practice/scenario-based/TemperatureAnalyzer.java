import java.util.Scanner;

public class TemperatureAnalyzer {
    static void analyzeTemperature(float[][] temp){
        float hottest = temp[0][0];
        float coldest = temp[0][0];
        int hotDay=0,coldDay=0;

        for(int i=0;i<7;i++){
            float sum=0;
            for(int j=0;j<24;j++){
                sum += temp[i][j];
                if(temp[i][j]>hottest){
                    hottest = temp[i][j];
                    hotDay = i;
                }
                if(temp[i][j]<coldest){
                    coldest = temp[i][j];
                    coldDay = i;
                }
            }
            System.err.println("Average temperature for day " + (i+1) + ": " + (sum/24));
        }
        System.err.println("Hottest Day:Day"+(hotDay+1));
        System.err.println("Coldest Day:Day"+(coldDay+1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] temperature = new float[7][24];

        System.out.println("Enter hourly temperature for 7 days:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + (i + 1));
            for (int j = 0; j < 24; j++) {
                temperature[i][j] = sc.nextFloat();
            }
        }

        analyzeTemperature(temperature);
    }
}

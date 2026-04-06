
// single Inheritance : Smart Home Devices 

class Device{  // Superclass Device
    String deviceId;
    String status;

    Device(String deviceId, String status){  // Constructor for device
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus(){   // Method to display device status
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device{   // Subclass Thermostat
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temperature){  // Constructor using super
        super(deviceId, status);
        this.temperatureSetting = temperature;
    }

    void displayStatus(){   // Overriding displayStatus method
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices{
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH1001", "ON", 24);
        t1.displayStatus();
    }
}

package devices;

public class Thermostat implements Device {
    private int temperature = 22;

    public void operate() {
        System.out.println("Thermostat at " + temperature);
    }

    public String getDescription() {
        return "Thermostat";
    }

    public void setEcoMode() {
        temperature = 18;
        System.out.println("Thermostat: eco mode ");
    }

    public void setComfortMode() {
        temperature = 22;
        System.out.println("Thermostat: normal mode ");
    }
}

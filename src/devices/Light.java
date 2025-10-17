package devices;

public class Light implements Device {
    private boolean isOn = false;

    public void operate() {
        isOn = !isOn;
        System.out.println("Light is " + (isOn ? "ON" : "OFF"));
    }

    public String getDescription() {
        return "Light";
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light turned OFF");
    }

    public void dim() {
        System.out.println("Light dimmed");
    }
}

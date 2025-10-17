package decorators;

import devices.Device;

public class EnergySavingDecorator extends DeviceDecorator {

    public EnergySavingDecorator(Device device) {
        super(device);
    }

    public void operate() {
        System.out.println("Energy Saving - working");
        super.operate();
    }

    public String getDescription() {
        return super.getDescription() + " + Energy Saving";
    }
}

package decorators;

import devices.Device;

public class RemoteAccessDecorator extends DeviceDecorator {

    public RemoteAccessDecorator(Device device) {
        super(device);
    }

    public void operate() {
        System.out.println("Remote Access - working");
        super.operate();
    }

    public String getDescription() {
        return super.getDescription() + " + Remote Access";
    }
}

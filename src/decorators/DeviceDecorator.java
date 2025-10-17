package decorators;

import devices.Device;

public abstract class DeviceDecorator implements Device {
    protected Device device;

    public DeviceDecorator(Device device) {
        this.device = device;
    }

    public void operate() {
        device.operate();
    }

    public String getDescription() {
        return device.getDescription();
    }
}

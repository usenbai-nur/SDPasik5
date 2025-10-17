package decorators;

import devices.Device;

public class VoiceControlDecorator extends DeviceDecorator {

    public VoiceControlDecorator(Device device) {
        super(device);
    }

    public void operate() {
        System.out.println("Voice control - working");
        super.operate();
    }

    public String getDescription() {
        return super.getDescription() + " + Voice Control";
    }
}

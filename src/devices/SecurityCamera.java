package devices;

public class SecurityCamera implements Device {
    private boolean isRecording = false;

    public void operate() {
        isRecording = !isRecording;
        System.out.println("Camera is " + (isRecording ? "working" : "idle"));
    }

    public String getDescription() {
        return "Security Camera";
    }

    public void startRecording() {
        isRecording = true;
        System.out.println("Camera started recording");
    }

    public void stopRecording() {
        isRecording = false;
        System.out.println("Camera stopped recording");
    }

    public void enableMotionDetection() {
        System.out.println("Motion detection enabled");
    }
}

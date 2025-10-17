package devices;

public class MusicSystem implements Device {
    private boolean isPlaying = false;
    private int volume = 50;

    public void operate() {
        isPlaying = !isPlaying;
        System.out.println("Music is " + (isPlaying ? "playing" : "stopped"));
    }

    public String getDescription() {
        return "Music System";
    }

    public void play() {
        isPlaying = true;
        System.out.println("Music started playing");
    }

    public void stop() {
        isPlaying = false;
        System.out.println("Music stopped");
    }

    public void setVolume(int vol) {
        volume = vol;
        System.out.println("Volume: " + vol);
    }
}

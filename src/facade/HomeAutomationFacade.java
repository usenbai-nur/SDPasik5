package facade;

import devices.*;

public class HomeAutomationFacade {
    private Light light;
    private MusicSystem music;
    private Thermostat thermostat;
    private SecurityCamera camera;

    public HomeAutomationFacade(Light light, MusicSystem music,
                                Thermostat thermostat, SecurityCamera camera) {
        this.light = light;
        this.music = music;
        this.thermostat = thermostat;
        this.camera = camera;
    }

    public void activateNightMode() {
        System.out.println("\nNight mode");
        light.turnOff();
        thermostat.setEcoMode();
        camera.startRecording();
        camera.enableMotionDetection();
    }

    public void startPartyMode() {
        System.out.println("\nParty mode");
        light.turnOn();
        light.dim();
        music.play();
        music.setVolume(80);
    }

    public void leaveHome() {
        System.out.println("\nLeave home");
        light.turnOff();
        music.stop();
        thermostat.setEcoMode();
        camera.startRecording();
    }
}

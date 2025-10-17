import devices.*;
import decorators.*;
import facade.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Decorator patterns:\n");

        Light light = new Light();
        light.operate();
        System.out.println();

        Device smartLight = new VoiceControlDecorator(
                new EnergySavingDecorator(light));
        System.out.println("Device: " + smartLight.getDescription());
        smartLight.operate();

        System.out.println();

        MusicSystem music = new MusicSystem();
        Device smartMusic = new RemoteAccessDecorator(
                new EnergySavingDecorator(music));
        System.out.println("Device: " + smartMusic.getDescription());
        smartMusic.operate();

        System.out.println("\nFacade pattern:\n");

        Light facadeLight = new Light();
        MusicSystem facadeMusic = new MusicSystem();
        Thermostat thermostat = new Thermostat();
        SecurityCamera camera = new SecurityCamera();

        HomeAutomationFacade home = new HomeAutomationFacade(
                facadeLight, facadeMusic, thermostat, camera);

        home.startPartyMode();
        home.activateNightMode();
        home.leaveHome();

    }
}

package Command_Pattern;

// CommandPatternTest.java
public class CommandPatternTest {
    public static void main(String[] args) {
        // Create receiver
        Light light = new Light();

        // Create command instances
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Turn light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}


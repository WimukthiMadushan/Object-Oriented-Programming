public class Main {
    public static void main(String[] args) {
        RemoteDevice device1 = new TV();
        RemoteDevice device2 = new SoundSystem();

        device1.turnOn();
        device1.turnOff();

        device2.turnOn();
        device2.turnOff();  
    }
}
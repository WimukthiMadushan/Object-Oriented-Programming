public class SoundSystem implements RemoteDevice{
    @Override
    public void turnOn() {
        System.out.println("Sound system is turning ON using the remote.");
    }

    @Override
    public void turnOff() {
        System.out.println("Sound system is turning OFF using the remote.");
    }
}

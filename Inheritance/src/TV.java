public class TV implements RemoteDevice{
    @Override
    public void turnOn() {
        System.out.println("TV is turning ON using the remote.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turning OFF using the remote.");
    }
}

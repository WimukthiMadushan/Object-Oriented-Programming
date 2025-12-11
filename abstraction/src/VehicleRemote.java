public class VehicleRemote extends RemoteControl{
    @Override
    void powerOn() {
        System.out.println("Vehicle Start");
    }

    @Override
    void powerOff() {
        System.out.println("Vehicle Stop");
    }
}

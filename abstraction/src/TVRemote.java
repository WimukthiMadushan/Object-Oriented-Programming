import java.rmi.Remote;

public class TVRemote extends RemoteControl {
    @Override
    void powerOn() {
        System.out.println("TV powered on");
    }

    @Override
    void powerOff() {
        System.out.println("TV powered off");
    }
}

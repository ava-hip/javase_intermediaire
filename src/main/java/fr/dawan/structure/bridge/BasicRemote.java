package fr.dawan.structure.bridge;

public class BasicRemote extends Remote{
    @Override
    public void changeVolume(int v) {
        device.setVolume(v);
    }

    @Override
    public void changeChannel(String c) {
        device.setChannel(c);
    }

    @Override
    public void switchOnOff() {
        if(device.isEnable()) {
            device.turnOff();
        }
    }
}

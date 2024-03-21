package fr.dawan.structure.bridge;

public class App {
    public static void main(String[] args) {

        BasicRemote remote = new BasicRemote();
        Device radio = new Radio();
        remote.setDevice(radio);
        remote.changeVolume(5);
        remote.changeChannel("TF1");
        remote.switchOnOff();
    }
}

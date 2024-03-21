package fr.dawan.structure.bridge;

public abstract class Remote {
    protected Device device;

    public void setDevice(Device device) {
        this.device = device;
    }

    public abstract void changeVolume(int v);
    public abstract void changeChannel(String c);
    public abstract void switchOnOff();
}

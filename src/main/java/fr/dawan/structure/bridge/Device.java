package fr.dawan.structure.bridge;

public interface Device {
    boolean isEnable();
    void setVolume(int v);
    void setChannel(String c);

    void turnOff();
}

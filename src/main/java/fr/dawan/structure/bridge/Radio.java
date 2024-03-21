package fr.dawan.structure.bridge;

public class Radio implements Device{
    @Override
    public boolean isEnable() {
        return false;
    }

    @Override
    public void setVolume(int v) {
        System.out.println("Le volume est à " + v);
    }

    @Override
    public void setChannel(String c) {
        System.out.println("La chaine est " + c);
    }

    @Override
    public void turnOff() {

    }
}

package fr.dawan.creation.singleton;

public class Pdg {
    private volatile static Pdg instance;

    // volatile -> garanti que la variable est visible et manipulable au travers de plusieurs thread
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized static Pdg getInstance() {
        if (instance == null) {
            instance = new Pdg();
        }
        return instance;
    }
}

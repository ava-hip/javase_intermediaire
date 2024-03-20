package fr.dawan.consolidation.genericite;

import java.io.Serializable;

public abstract class BaseDb implements Serializable {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BaseDb(long id) {
        this.id = id;
    }

}

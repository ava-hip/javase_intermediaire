package fr.dawan.consolidation.genericite;

import java.lang.reflect.InvocationTargetException;

// Classe générique
public class Box<T> {
    private T contenu;

    public Box(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    public T create(Class<T> clazz) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // return clazz.newInstance(); deprecated depuis java 9
        return clazz.getDeclaredConstructor().newInstance();
    }

    //Type générique sur une méthode
    public <U> void afficherContenu(U prefix) {
        System.out.println(prefix.toString() + contenu);
    }
}

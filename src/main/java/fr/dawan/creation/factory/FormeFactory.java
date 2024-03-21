package fr.dawan.creation.factory;


import java.lang.reflect.InvocationTargetException;

public class FormeFactory {
/*

    public Forme getForme(String forme, double dimension){
        switch (forme){
            case "cercle":
                return new Cercle(dimension);
            case "carre" :
                return new Carre(dimension);
            default :
                return null;
        }
    }

}


public interface FormeFactory {
    public Forme getForme(double dimension);
}
*/

    public static <T> Forme getForme(Class<? extends Forme> clazz, double dimension) {
        try {
            return clazz.getConstructor(double.class).newInstance(dimension);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
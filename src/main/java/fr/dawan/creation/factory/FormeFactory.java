package fr.dawan.creation.factory;


import java.lang.reflect.InvocationTargetException;

//public class FormeFactory {


//    public static Forme getForme(String typeForme,double dimension) {
//        switch(typeForme) {
//        case "cercle":
//            return new Cercle(dimension);
//        case "carre":
//            return new Carre(dimension);
//            default:
//                return null;
//        }
//    }
//

//public static <T> Forme getForme(Class<? extends Forme> clazz,double dimension) throws Exception {
//    return clazz.getConstructor(double.class).newInstance(dimension);
//
//}

public interface FormeFactory {
    Forme getForme(double dimension);
}

package fr.dawan.consolidation.introspection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class App {

    public static void main(String[] args) {
        // introspection
        // 1 .class
        Class<String> c1 = String.class;

        // 2 .getClass() de Object
        String str = "hello";
        Class<? extends String> c2 = str.getClass();

        // 3 à partir du nom complet de la classe
        try {
            Class<?> c3 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Nom de la classe
        System.out.println(c1.getName());

        // Nom de la classe mère
        System.out.println(c1.getSuperclass().getName());

        // Attributs
        Field[] attributs = c1.getDeclaredFields();
        for (Field f : attributs) {
            System.out.print(f.getName() + "\t");
            System.out.println(f.getType().getName());
        }

        // Méthodes
        Method[] meths = c1.getDeclaredMethods();
        for (Method m : meths) {
            System.out.print(m.getName() + "\t");
            System.out.println(m.getReturnType().getName() + "\t");
            Parameter[] params = m.getParameters();
            for (Parameter p : params) {
                System.out.println("\t" + p.getName() + " " + p.getType().getName());
            }
        }

        // Constructeurs
        Constructor<?>[] constructeurs = c1.getDeclaredConstructors();
        for (Constructor<?> c : constructeurs) {
            System.out.println(c);
        }

        // Instantiation dynamique
        String strDyn2=null;
        try {
            // avec le constructeur par défaut
            String strDyn = c1.getDeclaredConstructor().newInstance();
            System.out.println(strDyn);

            // Avec le constructeur qui prend une chaine de caractère
            Constructor<String> constructeur=c1.getConstructor(String.class);
            strDyn2= constructeur.newInstance("test instrospection");
            System.out.println(strDyn2);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {

            e.printStackTrace();
        } catch (IllegalArgumentException e) {

            e.printStackTrace();
        } catch (InvocationTargetException e) {

            e.printStackTrace();
        } catch (NoSuchMethodException e) {

            e.printStackTrace();
        } catch (SecurityException e) {

            e.printStackTrace();
        }

        // Appeler une méthode dynamiquement
        try {
            Method mLength=foundMethod(meths,"length");
            System.out.println(mLength.invoke(strDyn2));

            Method mStartsWith=foundMethod(meths,"startsWith");
            System.out.println(mStartsWith.invoke(strDyn2,"test",0));
            System.out.println(mStartsWith.invoke(strDyn2,"aaa",0));
        }
        catch( Exception e) {
            e.printStackTrace();
        }
    }

    private static  Method foundMethod(Method[] mt,String nom) {
        for(Method m : mt) {
            if (m.getName().equals(nom)) {
                return m;
            }
        }
        return null;
    }

}

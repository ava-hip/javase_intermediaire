package fr.dawan.creation.factory;

public class App {

    private static FormeFactory formeFactory;
    public static void main(String[] args) {

//        Forme f1=FormeFactory.getForme("carre",5);
//        System.out.println(f1.calculSurface());

//        try {
//            Forme f2=FormeFactory.getForme(Cercle.class, 10);
//            System.out.println(f2.calculSurface());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        init("cercle");
        Forme f3=formeFactory.getForme(3);
        System.out.println(f3.calculSurface());

        Forme f4=new CarreFactory().getForme(20);
        System.out.println(f4.calculSurface());

    }

    private static void init(String str) {
        if(str.equals("cercle")) {
           formeFactory = new CercleFactory();
        } else {
            formeFactory = new CarreFactory();
        }
    }

}


package fr.dawan.creation.factory;

public class CarreFactory implements FormeFactory{

    @Override
    public Forme getForme(double dimension) {
        return new Carre(dimension);
    }
}




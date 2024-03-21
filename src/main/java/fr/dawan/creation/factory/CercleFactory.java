package fr.dawan.creation.factory;


public class CercleFactory implements FormeFactory{

    @Override
    public Forme getForme(double dimension) {
        return new Cercle(dimension);
    }
}



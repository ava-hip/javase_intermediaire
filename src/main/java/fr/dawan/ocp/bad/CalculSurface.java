package fr.dawan.ocp.bad;

public class CalculSurface {
    public double calculSurfaceRectangle(Rectangle rectangle) {
        return rectangle.getLargeur()*rectangle.getLongueur();
    }

    public double calculSurfaceCercle(Cercle cercle) {
        return cercle.getRayon()*cercle.getRayon()*Math.PI;
    }
}

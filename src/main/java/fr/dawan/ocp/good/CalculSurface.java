package fr.dawan.ocp.good;

// on respecte  le principe Open Closed
// La classe est fermée à la modification
// On peut calculer la surface de nouvelle forme en implémentant
// Forme -> ouvert à l'extension

public class CalculSurface {
   public double calculSurface(Forme forme) {
       return forme.calculSurface();
   }

}

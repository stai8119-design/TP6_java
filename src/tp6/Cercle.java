package tp6;

public class Cercle extends Forme {
	
	private double rayon;

    public Cercle(String couleur, double rayon) {
        super(couleur);
        this.rayon = rayon;
    }

    @Override
    public void dessiner() {
        System.out.println("Dessine un cercle de couleur " 
            + couleur + " et de rayon " + rayon);
    }
}

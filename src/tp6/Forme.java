package tp6;

public class Forme {

	 protected String couleur;

	    public Forme(String couleur) {
	        this.couleur = couleur;
	    }

	   
	    public void dessiner() {
	        System.out.println("Dessine une forme de couleur " + couleur);
	    }
}

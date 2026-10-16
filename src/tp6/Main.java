package tp6;

public class Main {
	 public static void main(String[] args) {
	        
	        Forme[] formes = new Forme[] {
	            new Cercle("Rouge",   5.0),
	            new Rectangle("Bleu", 3.0, 2.0),
	            new Triangle("Jaune",  6.0, 2.5),
	            new Forme("Noir")     
	        };

	      
	        for (Forme f : formes) {
	            f.dessiner();  
	        }
	    }

}

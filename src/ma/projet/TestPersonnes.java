package ma.projet;

import java.util.*;

public class TestPersonnes {
	public static void main(String[] args) {
        List<Personne> equipe = new ArrayList<>();
        equipe.add(new Developpeur("Chaimae", 3000));
        equipe.add(new Manager("Ahmad",      2400));
        equipe.add(new Developpeur("Sanae", 5200));

        
        Utils.listerPersonnes(equipe);
    }

}

package Composite;

import java.util.*;

public class VoitureComposite implements Composant {

	private List<Composant> composants;

    public VoitureComposite() {
        composants = new ArrayList<Composant>();
    }

  
    public void add(Composant composant){
     
    	composants.add(composant);
    }

  
    public void remove(Composant composant){
    	composants.remove(composant);
    }

    @Override
    public int getPrice() {
        int result = 0;
        for (Iterator<Composant> i = composants.iterator(); i.hasNext(); ) {
            Object objet = i.next();
            Composant composant = (Composant)objet;
            result += composant.getPrice();
        }
        return result;
    }
}

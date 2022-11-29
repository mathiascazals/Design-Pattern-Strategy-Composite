import java.util.*;

public class VoitureComposite implements Composant {

	private Collection children;

    public VoitureComposite() {
        children = new ArrayList();
    }

  
    public void add(Composant composant){
     
        children.add(composant);
    }

  
    public void remove(Composant composant){
        children.remove(composant);
    }

    public Iterator getChildren() {
        return children.iterator();
    }
	
	@Override
    public int getPrice() {
        int result = 0;
        for (Iterator i = children.iterator(); i.hasNext(); ) {
            Object objet = i.next();
			
            Composant composant = (Composant)objet;

            result += composant.getPrice();
        }
        return result;
    }
}

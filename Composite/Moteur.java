
public class Moteur implements Composant {

	private int price;
   
    public Moteur(int price) {
		this.price = price;
    }
	
	@Override
    public int getPrice() {
        return this.price;
    }
}


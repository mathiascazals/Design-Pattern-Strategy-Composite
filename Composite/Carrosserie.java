package Composite;

public class Carrosserie implements Composant {

	private int price;
	   
    public Carrosserie(int price) {
		this.price = price;
    }
    
    @Override
    public int getPrice() {
        return this.price;
    }

}

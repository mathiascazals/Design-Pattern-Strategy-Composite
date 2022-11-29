
public class Roue implements Composant {

	private int price;
   
    public Roue(int price) {
		this.price = price;
    }
    
    @Override
    public int getPrice() {
        return this.price;
    }
}
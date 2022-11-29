
public class Piston implements Composant {
		
	private int price;
	   
    public Piston(int price) {
		this.price = price;
    }
	
	@Override
    public int getPrice() {
        return this.price;
    }
}

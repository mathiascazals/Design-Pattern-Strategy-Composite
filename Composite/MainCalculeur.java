package Composite;


public class MainCalculeur {

	public static void main(String[] args) {
		
		Composant deuxjz = new Moteur(1000);
		System.out.println("Le prix de mon moteur est: "+deuxjz.getPrice()+" €");
		
		Composant roueavg = new Roue(100);
		Composant roueavd = new Roue(100);
		Composant rouearg = new Roue(100);
		Composant roueard = new Roue(100);
		System.out.println("Le prix d'une roue est: "+roueavd.getPrice()+" €");
		
		Composant carrosserie = new Carrosserie(700);
		System.out.println("Le prix de la carrosserie est: "+carrosserie.getPrice()+" €");

		
		VoitureComposite supra = new VoitureComposite();
		supra.add(deuxjz,roueavd,roueavg,roueard,rouearg,carrosserie);
		System.out.print("Le prix de ma voiture est: "+supra.getPrice()+" €.");
		}

}

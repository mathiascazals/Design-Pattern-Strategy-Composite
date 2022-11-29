package Composite;


public class MainCalculeur {

	public static void main(String[] args) {
		
		Moteur deuxjz = new Moteur(1000);
		System.out.println("Le prix de mon moteur est: "+deuxjz.getPrice()+" €");
		
		Roue roueavg = new Roue(100);
		Roue roueavd = new Roue(100);
		Roue rouearg = new Roue(100);
		Roue roueard = new Roue(100);
		System.out.println("Le prix d'une roue est: "+roueavd.getPrice()+" €");
		
		Carrosserie carrosserie = new Carrosserie(700);
		System.out.println("Le prix de la carrosserie est: "+carrosserie.getPrice()+" €");

		
		VoitureComposite supra = new VoitureComposite();
		supra.add(deuxjz);
		supra.add(roueavd);
		supra.add(roueavg);
		supra.add(roueard);
		supra.add(rouearg);
		supra.add(carrosserie);
		System.out.print("Le prix de ma voiture est: "+supra.getPrice()+" €.");
		}

}

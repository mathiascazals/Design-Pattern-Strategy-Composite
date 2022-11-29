
public class main {

	public static void main(String[] args) {
		
		Moteur deuxjz = new Moteur(1000);
		System.out.println("Le prix de mon moteur est:");
		System.out.println(deuxjz.getPrice());
		
		Roue roueavg = new Roue(100);
		Roue roueavd = new Roue(100);
		Roue rouearg = new Roue(100);
		Roue roueard = new Roue(100);
		System.out.println("Le prix de ma roue avant droite est:");
		System.out.println(roueavd.getPrice());
		
		VoitureComposite supra = new VoitureComposite();
		supra.add(deuxjz);
		supra.add(roueavd);
		supra.add(roueavg);
		supra.add(roueard);
		supra.add(rouearg);
		System.out.println("Le prix de ma supra est:");
		System.out.println(supra.getPrice());
		System.out.println("Euros");
	}

}

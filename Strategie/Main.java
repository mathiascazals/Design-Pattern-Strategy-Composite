import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Contexte contexte = new Contexte(null);

        Scanner input = new Scanner(System.in);
        System.out.println("Entrer facture");
        double a = Double.parseDouble(input.nextLine());

        System.out.println("Entrer Compte");
        String action = input.nextLine();

        if (action.equals("CB"))
            contexte.setStrategy(new CBstrategy(1000));

        if (action.equals("portefeuille"))
            contexte.setStrategy(new PorteFeuilleStrategy(100));

        if (action.equals("paypal"))
            contexte.setStrategy(new PayPalStrategy(400));

        contexte.executeStrategy(a);
    }

}

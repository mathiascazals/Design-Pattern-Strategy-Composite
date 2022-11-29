public class CBstrategy implements Strategy{
    private double solde;

    public CBstrategy(double solde) {
        this.solde = solde;
    }
    @Override
    public void execute(double a) {
        this.solde= solde+a;
        if(a>0){
            System.out.println("Vous avez ajouté "+ a +"€ dans votre compte bancaire.\n Votre solde actuel est de: "+solde+"€.");
        }else{
            System.out.println("Vous avez retiré "+ a +"€ dans votre compte bancaire.\n Votre solde actuel est de: "+solde+"€.");
        }
    }
}

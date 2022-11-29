public class Contexte {
    private Strategy strategie;

    public Contexte(Strategy strategie) {
        this.strategie = strategie;
    }

    public void setStrategy(Strategy strategie){
        this.strategie=strategie;
    }

    public void executeStrategy(double a) {
        strategie.execute(a);
    }
}

package exo2;


public class Client {

    public Tasse tasse ;
    public Cafe commandeCafe;
    public String nom ;
    public double valeurFacture ;

    public Client(String nom,Cafe commandeCafe, boolean tasseParDefaut) {
        this.nom = nom;
        this.commandeCafe = commandeCafe ;
        if(tasseParDefaut){
            this.tasse = new Tasse();
        }
    }

    public Client(String nom, Cafe commandeCafe,Tasse tasse) {
        this.tasse = tasse;
        this.commandeCafe = commandeCafe;
        this.nom = nom;
    }

    public Client() {
        this.setNom("Jean");
        this.tasse = new Tasse(100);


    }

    public Tasse getTasse() {
        return tasse;
    }

    public void setTasse(Tasse tasse) {
        this.tasse = tasse;
    }

    public Cafe getCommandeCafe() {
        return commandeCafe;
    }

    public void setCommandeCafe(Cafe commandeCafe) {
        this.commandeCafe = commandeCafe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getValeurFacture() {
        return valeurFacture;
    }

    public void setValeurFacture(double valeurFacture) {
        this.valeurFacture = valeurFacture;
    }



    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", commandeCafe=" + commandeCafe +
                ", tasse=" + tasse +
                ", valeurFacture=" + valeurFacture +
                '}';

    }

}

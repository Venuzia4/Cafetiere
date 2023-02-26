package exo4;

public class Client {

    String nom ;
    Cafe commandeCafe  ;
    Tasse tasse ;

    double valeurFacture  ;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    Client(String nom, Cafe commandeCafe, boolean avecTasse ) {
        this.nom = nom ;
        this.commandeCafe = commandeCafe ;

        if(avecTasse)
            tasse = new Tasse() ;
    }

    public Client(String nom, Cafe commandeCafe, Tasse tasse) {
        this.nom = nom;
        this.commandeCafe = commandeCafe;
        this.tasse = tasse;
    }

    public Client() {
        this.nom = "Jean" ;
        this.tasse = new Tasse() ;
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

package exo3;

public class Client {
   public  Tasse tasse ;
    public Cafe commandeCafe;
    public String nom ;
    double valeurFacture ;



    public Client() {
        this.nom="Jean";
        this.tasse= new Tasse(100);

    }

    public Client(String nom,Cafe commandeCafe, boolean tasseParDefaut) {
        this.nom = nom;
        this.commandeCafe = commandeCafe ;
        if(tasseParDefaut)
            this.tasse = new Tasse();
    }

    public Client(String nom, Cafe commandeCafe,Tasse tasse) {
        this.tasse = tasse;
        this.commandeCafe = commandeCafe;
        this.nom = nom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString(){
        return ("le nom du client est :" + nom + ",sa commande est "+ commandeCafe +"sa tasse "+tasse +"sa facture "+valeurFacture);
    }


}

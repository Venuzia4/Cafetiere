package exo3;


import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public Cafetiere cafetiere;

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public List<Client> getListeClientExpulse() {
        return listeClientExpulse;
    }

    public void setListeClientExpulse(List<Client> listeClientExpulse) {
        this.listeClientExpulse = listeClientExpulse;
    }

    public double profit;
    public ArrayList<Client> listeClientServi;
    List<Client> listeClientExpulse;
    private String nom;


    public Restaurant(String nom) {
        this.nom = nom;
        this.cafetiere = new Cafetiere();
        this.listeClientServi = new ArrayList<Client>();
    }


    public Restaurant(String nom,Cafetiere cafetiere,List<Client> listeClientServi ) {
        this.cafetiere = cafetiere;
        this.listeClientServi = new ArrayList<Client>();
        this.nom = nom;

    }


    public Restaurant() {
        this.cafetiere = new Cafetiere();
        this.nom = "Le Restaurant";
        this.listeClientServi = new ArrayList<Client>();
    }



    public boolean servir(Client client) {
        if(client.commandeCafe != null && client.commandeCafe.typeCafe != TypeCafe.BATARD) {
            double cout = 0;
            if(client.tasse == null) {
                if(client.commandeCafe.quantiteLiquideMl <= 100) {
                    cout += 2 ;
                    client.tasse = new Tasse() ;
                } else {
                    cout += 3 ;
                    client.tasse = new Tasse(500) ;
                }
            }

            cout += client.commandeCafe.quantiteLiquideMl * client.commandeCafe.typeCafe.coutParM ;
            client.tasse.addCafe(client.commandeCafe) ;
            profit += cout ;
            client.valeurFacture = cout;
            listeClientServi.add(client) ;
            return true ;
        }

        System.out.println("Expulse le client " + client.nom + " du restaurant ! ");
        return false ;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Cafetiere getCafetiere() {
        return cafetiere;
    }

    public void setCafetiere(Cafetiere cafetiere) {
        this.cafetiere = cafetiere;
    }

    public ArrayList<Client> getListeClientServi() {
        return listeClientServi;
    }

    public void setListeClientServi(ArrayList<Client> listeClientServi) {
        this.listeClientServi = listeClientServi;
    }

        @Override
    public String toString(){
        return ("la liste des clients servies est la suivante :   " + listeClientServi + " le nom du restaurant est : "+ nom + " le profit est de : "+profit);
    }



}

package exo2;


import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public Cafetiere cafetiere;

    public double profit;
    private String nom;

    List<Client> listeClientExpulse;

    ArrayList<Client> listeClientServi;


    public Restaurant() {
        this.nom = "Le Restaurant";
        this.cafetiere = new Cafetiere();
        this.listeClientServi = new ArrayList<>();
        this.listeClientExpulse = new ArrayList<>();
    }

    public Restaurant(String nom){
        this.nom = nom;
        cafetiere = new Cafetiere() ;
        this.listeClientServi = new ArrayList<>();
        listeClientExpulse = new ArrayList<>();
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
}




package exo4;



import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public Cafetiere cafetiere;

    public double profit;
    public ArrayList<Client> listeClientServi;
    List<Client> listeClientExpulse;
    private String nom;

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }


    public Restaurant(String nom) {
        this.nom = nom;
        this.cafetiere = new Cafetiere();
        this.listeClientServi = new ArrayList<Client>();
    }


    public Restaurant(String nom, Cafetiere cafetiere, List<exo3.Client> listeClientServi) {
        this.cafetiere = cafetiere;
        this.listeClientServi = new ArrayList<Client>();
        this.nom = nom;

    }

    public void demanderTypeCafe() {
        String[] options = new String[TypeCafe.values().length - 1];
        int i = 0;
        for (TypeCafe typeCafe : TypeCafe.values()) {
            if (typeCafe != TypeCafe.BATARD) {
                options[i++] = typeCafe.toString();
            }
        }
        String choix = JOptionPane.showInputDialog(null, "Quel est votre type de café ?", "Type de café", JOptionPane.QUESTION_MESSAGE, null, options, options[0]).toString();
        TypeCafe typeCafeChoisi = TypeCafe.valueOf(choix.toUpperCase());
        if (typeCafeChoisi == TypeCafe.BATARD) {
            JOptionPane.showMessageDialog(null, "Désolé, nous ne servons pas de café bâtard.", "Erreur", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Très bien, j'ai enregistré votre commande de " + typeCafeChoisi.toString() + " !", "Commande enregistrée", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public Restaurant() {
        this.cafetiere = new Cafetiere();
        this.nom = "Le Restaurant";
        this.listeClientServi = new ArrayList<Client>();
    }


    public boolean servir(Client client) {
        if (client.commandeCafe != null && client.commandeCafe.typeCafe != TypeCafe.BATARD) {
            double cout = 0;
            if (client.tasse == null) {
                if (client.commandeCafe.quantiteLiquideMl <= 100) {
                    cout += 2;
                    client.tasse = new Tasse();
                } else {
                    cout += 3;
                    client.tasse = new Tasse(500);
                }
            }

            cout += client.commandeCafe.quantiteLiquideMl * client.commandeCafe.typeCafe.coutParM;
            client.tasse.addCafe(client.commandeCafe);
            profit += cout;
            client.valeurFacture = cout;
            listeClientServi.add(client);
            return true;
        }

        System.out.println("Expulse le client " + client.nom + " du restaurant ! ");
        return false;

    }

    public String getNom() {
        return nom;
    }

}
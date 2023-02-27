package exo4;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        String nomClient = JOptionPane.showInputDialog(null, "Bonjour, quel est votre nom ?");

        int reponseCommande = JOptionPane.showConfirmDialog(null, "Bonjour " + nomClient + ", puis-je prendre votre commande ?");

        if (reponseCommande == JOptionPane.YES_OPTION) {

            TypeCafe[] options = TypeCafe.values();
            TypeCafe typeCafe = (TypeCafe) JOptionPane.showInputDialog(null, "Quel type de café désirez-vous ?", "Choix du café", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (typeCafe == TypeCafe.BATARD) {
                JOptionPane.showMessageDialog(null, "Désolé, nous ne servons pas de café bâtard !");
                System.exit(0);
            }
            int reponseTasse = JOptionPane.showConfirmDialog(null, "Avez-vous votre propre tasse ?");
            boolean avecTasse = (reponseTasse == JOptionPane.YES_OPTION);
            int taille = 0;

            if (avecTasse) {
                String tailleStr = JOptionPane.showInputDialog(null, "Quelle est la taille de votre tasse ?");
                taille = Integer.parseInt(tailleStr);
            }
            JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 500, 0);
            slider.setMajorTickSpacing(50);
            slider.setPaintTicks(true);
            slider.setPaintLabels(true);

            JOptionPane.showMessageDialog(null, slider, "Quantité de café", JOptionPane.QUESTION_MESSAGE);

            int quantite = slider.getValue();

            Cafe cafe = new Cafe(typeCafe, quantite);
            Client client = new Client(nomClient, cafe, avecTasse);

            restaurant.servir(client);
            int somme = (int) client.valeurFacture;

            while (true) {
                String reponsePaiementStr = JOptionPane.showInputDialog(null, "Le total de votre facture est de " + somme + " centimes. Combien désirez-vous payer ?");
                int reponsePaiement = Integer.parseInt(reponsePaiementStr);

                if (reponsePaiement == somme) {
                    JOptionPane.showMessageDialog(null, "Merci pour votre paiement, au revoir !");
                    break;
                } else if (reponsePaiement > somme) {
                    int rendu = reponsePaiement - somme;
                    JOptionPane.showMessageDialog(null, "Merci pour votre paiement, voici votre monnaie : " + rendu + " centimes. Au revoir !");
                    break;
                } else {
                    somme -= reponsePaiement;
                    JOptionPane.showMessageDialog(null, "Il reste " + somme + " centimes à payer.");
                }

                if (somme > 0) {
                    JOptionPane.showMessageDialog(null, "Il reste " + somme + " centimes à payer.");
                } else {
                    JOptionPane.showMessageDialog(null, "Au voleur, au voleur ! Mais que fait la police ?");
                }
            }
        }
    }
}




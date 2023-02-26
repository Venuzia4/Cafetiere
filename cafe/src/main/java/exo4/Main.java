package exo4;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Restaurant resto = new Restaurant();
        TypeCafe[] typesCafe = TypeCafe.values();
        String nomClient = JOptionPane.showInputDialog(null, "Bonjour ! Quel est votre nom ?");

        JOptionPane.showMessageDialog(null, "Bonjour " + nomClient + " ! Bienvenue au restaurant.");

        int choix = JOptionPane.showConfirmDialog(null, "Puis-je prendre votre commande, " + nomClient + " ?");
        if (choix == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Très bien, je prends note de votre commande !");
        } else {
            JOptionPane.showMessageDialog(null, "D'accord, n'hésitez pas à me faire signe si vous avez besoin d'aide.");
        }

        String typeCafeChoisi = String.valueOf(JOptionPane.showInputDialog(null, "Quel est votre type de café ?", "Choix du café", JOptionPane.QUESTION_MESSAGE, null, typesCafe, typesCafe[0].toString()));

        if (typeCafeChoisi.equals(TypeCafe.BATARD.toString())) {
            JOptionPane.showMessageDialog(null, "Je suis désolé, vous n'êtes pas le bienvenu ici.");
            System.exit(0);
        }
        int choixTasse = JOptionPane.showConfirmDialog(null, "Avez-vous votre propre tasse ?", "Choix de la tasse", JOptionPane.YES_NO_OPTION);
        String tailleTasse = JOptionPane.showInputDialog(null, "Quelle est la taille de votre tasse (en ml) ?", "Taille de la tasse", JOptionPane.QUESTION_MESSAGE);
        boolean aTasse = (choix == JOptionPane.YES_OPTION);

        JSlider quantiteSlider = new JSlider(JSlider.HORIZONTAL, 0, 500, 0);
        quantiteSlider.setMajorTickSpacing(50);
        quantiteSlider.setPaintTicks(true);
        quantiteSlider.setPaintLabels(true);

        if (aTasse) {
            String taille = JOptionPane.showInputDialog("Quelle taille pour votre café ?");
           //client = new ClientAvecTasse(typeCafe, tailleTasse, quantiteCafe);
        } else {
            String typeCafe = JOptionPane.showInputDialog("Quel type de café voulez-vous ?");
         // client = new ClientSansTasse(typeCafe,quantiteCafe);
        }
        Restaurant restaurant =new Restaurant();
        int cout = restaurant.calculerPrix(client);
        JOptionPane.showMessageDialog(null, "Le coût de votre commande est de " + cout + " centimes.");

        int montantPaye = Integer.parseInt(JOptionPane.showInputDialog("Veuillez payer en centimes :"));

        if (montantPaye == cout) {
            JOptionPane.showMessageDialog(null, "Merci beaucoup ! Bonne dégustation !");
        } else if (montantPaye > cout) {
            int rendu = montantPaye - cout;
            JOptionPane.showMessageDialog(null, "Merci beaucoup ! Voici votre monnaie : " + rendu + " centimes.");
        } else {
            int reste = cout - montantPaye;
            int nbEssais = 0;
            while (reste > 0 && nbEssais < 3) {
                montantPaye = Integer.parseInt(JOptionPane.showInputDialog("Il manque " + reste + " centimes. Veuillez payer la somme restante :"));
                reste -= montantPaye;
                nbEssais++;
            }
            if (reste == 0) {
                JOptionPane.showMessageDialog(null, "Merci beaucoup ! Bonne dégustation !");
            } else {
                JOptionPane.showMessageDialog(null, "Au voleur, au voleur ! Mais que fait la police ?");
            }
        }
    }

    }

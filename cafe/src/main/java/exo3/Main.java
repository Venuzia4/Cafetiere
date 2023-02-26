package exo3;

import java.util.*;

public class Main {

    public static void main(String args[]) {
        Restaurant restaurant1 = new Restaurant("Latte sur les rochers");
        Restaurant restaurant2 = new Restaurant("Une tasse de joie");
        Restaurant restaurant3 = new Restaurant();
        Restaurant restaurant= new Restaurant();

        ArrayList<Client> listeClient1 = genererListeClients();
        ArrayList<Client> listeClient2 = genererListeClients();
        ArrayList<Client> listeClient3 = genererListeClients();
        ArrayList<Client> listeClientsExpulse = new ArrayList<>();

        ArrayList<Client> clientsServis = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int choixResto = rand.nextInt(3);
            Client client = null;
            switch (choixResto) {
                case 0:
                    if (!listeClient1.isEmpty()) {
                        client = listeClient1.remove(0);
                        clientsServis.add(client);
                        restaurant1.servir(client);
                    }
                    break;
                case 1:
                    if (!listeClient2.isEmpty()) {
                        client = listeClient2.remove(0);
                        clientsServis.add(client);
                        restaurant2.servir(client);
                    }
                    break;
                case 2:
                    if (!listeClient3.isEmpty()) {
                        client = listeClient3.remove(0);
                        clientsServis.add(client);
                        restaurant3.servir(client);
                    }
                    break;
                default:
                    break;
            }
            if (client != null) {
                listeClientsExpulse.add(client);
            }
        }
        System.out.println("Clients servis :");
        for (Client c : clientsServis) {
            System.out.println(c);
        }
        System.out.println();
        System.out.println("Clients expulsés :");
        for (Client c : listeClientsExpulse) {
            System.out.println(c);
        }
        System.out.println("Restaurant : " + restaurant1.getNom());
        System.out.println("Profit total : " + restaurant1.getProfit());
        System.out.println("Nombre de clients servis : " + restaurant1.getListeClientServi().size());
        System.out.println();
        System.out.println("Restaurant : " + restaurant2.getNom());
        System.out.println("Profit total : " + restaurant2.getProfit());
        System.out.println("Nombre de clients servis : " + restaurant2.getListeClientServi().size());
        System.out.println();
        System.out.println("Restaurant : " + restaurant3.getNom());
        System.out.println("Profit total : " + restaurant3.getProfit());
        System.out.println("Nombre de clients servis : " + restaurant3.getListeClientServi().size());
        System.out.println();
        for (Client client : listeClientsExpulse) {
            System.out.println("- " + client.getNom());
        }

    }

    public static ArrayList<Client> genererListeClients() {
        ArrayList<Client> listeClients = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            String nom = BanqueDeDonnees.listeNoms.get(rand.nextInt(BanqueDeDonnees.listeNoms.size()));
            Cafe commande = BanqueDeDonnees.listeCommandes.get(rand.nextInt(BanqueDeDonnees.listeCommandes.size()));
            Tasse tasse = BanqueDeDonnees.listeTasses.get(rand.nextInt(BanqueDeDonnees.listeTasses.size()));
            Client client = new Client(nom, commande, tasse);
            listeClients.add(client);
        }
        return listeClients;


    }



    }










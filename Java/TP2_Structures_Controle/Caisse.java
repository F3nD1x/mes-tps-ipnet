// KOUDADZE Kodjogan Josias - N = 8
// CSC 300 - TP2 - Partie D - Caisse (version corrigee)

public class Caisse {
    public static void main(String[] args) {
        int montant = 3000;
        char mode = 'M';
        int ticket = 1;

        // Correction 1 : == au lieu de =
        if (mode == 'M') {
            System.out.println("Client mobile");
        }

        // Correction 2 : suppression du ; apres la condition
        if (montant > 5000) {
            System.out.println("Remise de 5 %");
        }

        // Correction 3 : ajout du break manquant apres case 'M'
        switch (mode) {
            case 'E':
                System.out.println("Paiement en especes");
                break;
            case 'M':
                System.out.println("Paiement mobile");
                break;
            case 'C':
                System.out.println("Paiement par carte");
                break;
        }

        // Correction 4 : incrementation de ticket pour eviter la boucle infinie
        while (ticket <= 3) {
            System.out.println("Impression du ticket " + ticket);
            ticket++;
        }
    }
}

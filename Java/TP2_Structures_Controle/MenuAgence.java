// KOUDADZE Kodjogan Josias - N = 8
// CSC 300 - TP2 - Partie B - MenuAgence (switch classique)

public class MenuAgence {
    public static void main(String[] args) {
        int n = 8;
        int choix = n % 4 + 1;   // 1

        System.out.println("Choix = " + choix);

        switch (choix) {
            case 1:
                System.out.println("Envoi d'argent");
                break;
            case 2:
                System.out.println("Retrait d'argent");
                break;
            case 3:
                System.out.println("Consultation du solde");
                break;
            case 4:
                System.out.println("Historique des operations");
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }
}

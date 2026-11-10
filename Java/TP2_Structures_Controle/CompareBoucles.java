// KOUDADZE Kodjogan Josias - N = 8
// CSC 300 - TP2 - Partie C - CompareBoucles (while vs do-while)

public class CompareBoucles {
    public static void main(String[] args) {
        int solde = 3000;
        int retrait = 7000;

        System.out.println("--- Boucle while ---");
        while (solde >= retrait) {
            System.out.println("Retrait effectue (while)");
            solde -= retrait;
        }
        System.out.println("Solde apres while : " + solde);

        // On remet le solde pour le do-while
        solde = 3000;

        System.out.println("--- Boucle do-while ---");
        do {
            System.out.println("Retrait effectue (do-while)");
            solde -= retrait;
        } while (solde >= retrait);
        System.out.println("Solde apres do-while : " + solde);
    }
}

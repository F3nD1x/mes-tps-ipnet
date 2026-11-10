// KOUDADZE Kodjogan Josias - N = 8
// CSC 300 - TP2 - Partie C - Recus (boucle for)

public class Recus {
    public static void main(String[] args) {
        int n = 8;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            int montant = 500 * i;
            System.out.println("Recu n " + i + " : " + montant + " FCFA");
            total += montant;
        }
        System.out.println("Total des recus : " + total + " FCFA");
    }
}

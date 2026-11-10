// KOUDADZE Kodjogan Josias - N = 8
// CSC 300 - TP2 - Partie C - Retraits (do-while)

public class Retraits {
    public static void main(String[] args) {
        int n = 8;
        int solde = 20000 + n * 1000;   // 28000
        int retrait = 7000;
        int nbRetraits = 0;

        do {
            solde -= retrait;
            nbRetraits++;
            System.out.println("Retrait n " + nbRetraits + " - Solde restant : " + solde + " FCFA");
        } while (solde >= retrait);

        System.out.println("Nombre de retraits : " + nbRetraits);
        System.out.println("Solde final : " + solde + " FCFA");
    }
}

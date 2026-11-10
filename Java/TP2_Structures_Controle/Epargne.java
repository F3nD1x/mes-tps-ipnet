// KOUDADZE Kodjogan Josias - N = 8
// CSC 300 - TP2 - Partie C - Epargne (boucle while)

public class Epargne {
    public static void main(String[] args) {
        int n = 8;
        int objectif = 100000 + n * 10000;   // 180000
        int versement = 15000;
        int epargne = 0;
        int mois = 0;

        while (epargne < objectif) {
            epargne += versement;
            mois++;
            System.out.println("Mois " + mois + " : epargne " + epargne + " FCFA");
        }
        System.out.println("Objectif : " + objectif + " FCFA");
        System.out.println("Nombre de mois : " + mois);
    }
}

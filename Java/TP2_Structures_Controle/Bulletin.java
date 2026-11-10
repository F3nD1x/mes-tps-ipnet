// KOUDADZE Kodjogan Josias - N = 8
// CSC 300 - TP2 - Partie A - Bulletin

public class Bulletin {
    public static void main(String[] args) {
        String prenom = "Kodjogan";
        int n = 8;
        double noteDevoir = 10 + n % 5;   // 13
        double noteTp = 12;
        double noteExamen = 5 + n;        // 13
        int absences = n % 7;             // 1

        System.out.println("Prenom : " + prenom);
        System.out.println("N = " + n);

        if (noteDevoir < 0 || noteDevoir > 20 || noteTp < 0 || noteTp > 20 || noteExamen < 0 || noteExamen > 20) {
            System.out.println("Note invalide : calcul impossible");
        } else {
            double moyenne = (noteDevoir + noteTp + 2 * noteExamen) / 4.0;
            System.out.println("Moyenne : " + moyenne);
            System.out.println("Absences : " + absences);

            if (moyenne >= 10 && absences <= 5) {
                System.out.print("Decision : ADMIS");
                if (moyenne >= 16) {
                    System.out.println(" - Mention : Tres bien");
                } else if (moyenne >= 14) {
                    System.out.println(" - Mention : Bien");
                } else if (moyenne >= 12) {
                    System.out.println(" - Mention : Assez bien");
                } else {
                    System.out.println(" - Mention : aucune");
                }
            } else {
                System.out.println("Decision : AJOURNE");
            }
        }
    }
}

// KOUDADZE Kodjogan Josias - N = 8
// CSC 300 - TP2 - Partie B - Filiere (switch avec fleche)

public class Filiere {
    public static void main(String[] args) {
        String codeFiliere = "GL";

        switch (codeFiliere) {
            case "GL" -> System.out.println("Genie Logiciel");
            case "CS" -> System.out.println("Cybersecurite");
            case "IA" -> System.out.println("Intelligence Artificielle");
            case "IG" -> System.out.println("Informatique de Gestion");
            case "DWM" -> System.out.println("Developpement Web et Mobile");
            case "WIM" -> System.out.println("Webdesign, Infographie et Multimedia");
            case "RSS" -> System.out.println("Reseaux, Systemes et Securite");
            case "SD" -> System.out.println("Sciences des Donnees");
            default -> System.out.println("Filiere inconnue : " + codeFiliere);
        }
    }
}

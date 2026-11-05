import java.util.Scanner;

public class tp3 {
    String nom;
    String code;
    String classe;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tp3 etudiant = new tp3();  

        System.out.println("saisir nom E: ");
        etudiant.nom = scanner.nextLine();
        System.out.println("saisir code E: ");
        etudiant.code = scanner.nextLine();
        System.out.println("saisir classe E: ");
        etudiant.classe = scanner.nextLine();

        int choix;
        do {
            System.out.println("--- MENU ETUDIANT ---");
            System.out.println("1. afficher details etudiant");
            System.out.println("2. afficher code E et classe");
            System.out.println("3. Quitter");
            System.out.print("Votre choix (1-3): ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Nom: " + etudiant.nom);
                    System.out.println("Code: " + etudiant.code);
                    System.out.println("Classe: " + etudiant.classe);
                    break;
                case 2:
                    System.out.println("le code est: " + etudiant.code);
                    System.out.println("la classe est: " + etudiant.classe);
                    break;
                case 3:
                    System.out.println("au revoir");
                    break;
                default:
                    System.out.println("choix invalide.");
            }
        } while (choix != 3);

        scanner.close();
    }
}
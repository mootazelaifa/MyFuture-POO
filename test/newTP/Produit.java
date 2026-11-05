import java.util.Scanner;

public class Produit {

    Scanner scanner = new Scanner(System.in);

    String reference;
    String designation;
    double prixHT;
    int quantiteStock;

    public Produit(String reference, String designation, double prixHT, int quantiteStock) {

        this.reference = reference;
        this.designation = designation;
        this.prixHT = prixHT;
        this.quantiteStock = quantiteStock;
    }
    public void saisirProduit() {

        System.out.println("Donner la reference : ");
        reference = scanner.nextLine();

        System.out.println("Donner la designation : ");
        designation = scanner.nextLine();

        System.out.println("Donner le prix HT : ");
        prixHT = scanner.nextDouble();

        System.out.println("Donner la quantite en stock : ");
        quantiteStock = scanner.nextInt();
    }
    public double calculerPrixTTC(double tauxTVA) {
        return prixHT * (1 + tauxTVA);
    }
    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void afficherProduit() {

        System.out.println("Reference : " + reference);
        System.out.println("Designation : " + designation);
        System.out.println("Prix HT : " + prixHT);
        System.out.println("Quantite en stock : " + quantiteStock);
    }
    public void calculerValeurStock() {

        double valeur = prixHT * quantiteStock;

        System.out.println("Valeur du stock : " + valeur);
    }

    public void appliquerRemise() {
        System.out.println("Donner le pourcentage de remise : ");
        double pourcentageRemise = scanner.nextDouble();
        double nouveauPrix = prixHT * (1 - pourcentageRemise / 100);
        System.out.println("Prix HT avant remise : " + prixHT);
        System.out.println("Pourcentage de remise : " + pourcentageRemise + "%");
        System.out.println("Prix HT apres remise : " + nouveauPrix);
    }

    public static void main(String[] args) {

        Produit p1 = new Produit("", "", 0, 0);

        p1.saisirProduit();

        int choix;

        do {
            System.out.println("\n--- MENU PRODUIT ---");
            System.out.println("1. Afficher les details du produit");
            System.out.println("2. Calculer la valeur du stock");
            System.out.println("3. Appliquer une remise");
            System.out.println("4. Quitter");

            System.out.print("Votre choix (1-4) : ");
            choix = p1.scanner.nextInt();

            switch (choix) {

                case 1:
                    p1.afficherProduit();
                    break;

                case 2:
                    p1.calculerValeurStock();
                    break;

                case 3:
                    p1.appliquerRemise();
                    break;

                case 4:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 4);

        p1.scanner.close();
    }
}

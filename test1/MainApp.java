public class MainApp {

    public static void main(String[] args) {

        // 1. Creation des clients
        Client c1 = new Client("07123456", "Ben Salah", "Sonia", "98765432");
        Client c2 = new Client("09876543", "Kacem", "Ahmed", "50112233");

        // 2. Creation des comptes bancaires
        compteBancaire compte1 = new compteBancaire("CB-1001", 500.0, c1);
        compteBancaire compte2 = new compteBancaire("CB-1002", 1500.0, c2);

        // 3. Affichage initial des comptes
        compte1.afficherDetails();
        compte2.afficherDetails();

        // 4. Test des depots et retraits
        compte1.deposer(200.0);       // Solde passe a 700.0
        compte1.retirer(1000.0);      // Doit echouer (solde insuffisant)
        compte1.retirer(300.0);       // Solde passe a 400.0

        // 5. Test du virement
        //compte2.virement(compte1, 500.0); // Virement de 500 TND de compte2 vers compte1

        // 6. Etat final et statistiques
        compte1.afficherDetails();
        compte2.afficherDetails();

        System.out.println("\nNombre total de comptes crees : " + compteBancaire.get_nombre_comptes());
    }
}

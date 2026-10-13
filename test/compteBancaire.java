public class compteBancaire {
    String numeroCompte;
    double solde;
    Client titulaire;

    private static int nombreComptes = 0;

    public compteBancaire(String numero_compte, double solde_initial, Client titulaire) {
        this.numeroCompte = numero_compte;
        this.solde = solde_initial;
        this.titulaire = titulaire;
        nombreComptes++; 
    }

    public String get_numero_compte() {
        return numeroCompte;
    }

    public double get_solde() {
        return solde;
    }

    public Client get_titulaire() {
        return titulaire;
    }

    public void set_titulaire(Client titulaire) {
        this.titulaire = titulaire;
    }

    public static int get_nombre_comptes() {
        return nombreComptes;
    }

    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("depot de " + montant + " tnd effectue sur le compte " + numeroCompte);
        } else {
            System.out.println("erreur : le montant du depot doit etre superieur a 0.");
        }
    }
     public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("retrait de " + montant + " TND effectue sur le compte " + numeroCompte + ".");
        } else if (montant > solde) {
            System.out.println("echec : Solde insuffisant sur le compte " + numeroCompte + " (Solde actuel : " + solde + " TND).");
        } else {
            System.out.println("erreur : le montant du retrait doit etre superieur a 0.");
        }
    }

    public void afficherDetails() {
        System.out.println("compte N° : " + numeroCompte);
        System.out.print("titulaire : ");
        titulaire.afficherClient();
        System.out.println("solde actuel : " + solde + " tnd");
    }

    }

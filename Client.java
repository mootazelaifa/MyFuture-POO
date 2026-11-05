public class Client {

    // Attributs privés (encapsulation)
    private String cin;
    private String nom;
    private String prenom;
    private String telephone;

    // Constructeur avec tous les paramètres
    public Client(String cin, String nom, String prenom, String telephone) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    // Getters et Setters
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // Affichage : [CIN: 12345678] Nom & Prénom: Ben Ali Mohamed | Tél: 20123456
    public void afficherClient() {
        System.out.println("[CIN: " + cin + "] Nom & Prénom: " + nom + " " + prenom + " | Tél: " + telephone);
    }
}

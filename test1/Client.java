public class Client {
    String cin;
    String nom;
    String prenom;
    String tel;

    public Client(String vcin, String vnom, String vprenom, String vtel) {
        this.cin = vcin;
        this.nom = vnom;
        this.prenom = vprenom;
        this.tel = vtel;}


    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public String getTel(){
        return tel;
    }

    public void setCin(String vcin) {
      this.cin = vcin;
   }

   public void setNom(String vnom) {
      this.nom = vnom;
   }

   public void setPrenom(String vprenom) {
      this.prenom = vprenom;
   }

   public void setTelephone(String vtel) {
      this.tel = vtel;
   }

   public void afficherClient() {
        System.out.println("CIN: " + cin + " Nom et Prenom: " + nom + " " + prenom + " | Tel: " + tel);
    }
}

    
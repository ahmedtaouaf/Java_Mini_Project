public class Article {

    private String nom;
    private int quantite;
    private float prix;

    // constructeur
    public Article(String nom, int quantite, float prix) {
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
    }

    // getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    @Override
    public String toString() {
        return "Article{" +
                "nom='" + nom + '\'' +
                ", quantité=" + quantite +'\''+
                ", prix=" + prix+
                '}';
    }
}

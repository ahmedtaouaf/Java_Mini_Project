import java.util.ArrayList;
import java.util.List;

public class ListeArticles {
    private List<Article> articles;

    //constructeur
    public ListeArticles() {
        this.articles = new ArrayList<>();
    }

    //ajouter un article
    public void ajouterArticle(Article article) {
        articles.add(article);
    }

    //supprimer un article
    public void suppimerArticle(String nom) {
        articles.removeIf(item -> item.getNom().equalsIgnoreCase(nom));
    }
    //afficher la liste des articles
    public void afficherArticles() {
        if (articles.isEmpty()) {
            System.out.println("La liste d'épicerie est vide.");
        } else {
            for (Article article : articles) {
                System.out.println(article);
            }
        }
    }



}

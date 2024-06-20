import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListeArticles listeArticles = new ListeArticles();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter un article");
            System.out.println("2. Supprimer un article");
            System.out.println("3. Afficher la liste des articles");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Entrez le nom de l'article : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez la quantité : ");
                    int quantite = scanner.nextInt();
                    System.out.print("Entrez le prix : ");
                    float prix = scanner.nextInt();
                    listeArticles.ajouterArticle(new Article(nom, quantite,prix));
                    break;
                case 2:
                    System.out.print("Entrez le nom de l'article à supprimer : ");
                    String supprimerNom = scanner.nextLine();
                    listeArticles.suppimerArticle(supprimerNom);
                    break;
                case 3:
                    listeArticles.afficherArticles();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Option invalide.");
            }
        }
    }
}
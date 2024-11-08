public class Rectangle {
    private double longueur;
    private double largeur;

    public Rectangle() {
        this.longueur = 1;
        this.largeur = 1;
    }

    public Rectangle(double cote) {
        this.longueur = cote;
        this.largeur = cote;
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    public double surface() {
        return longueur * largeur;
    }

    public void agrandit(double facteur) {
        this.longueur *= facteur;
        this.largeur *= facteur;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 3);
        System.out.println("Périmètre : " + rect.perimetre());
        System.out.println("Surface : " + rect.surface());
        rect.agrandit(2);
        System.out.println("Nouveau périmètre : " + rect.perimetre());
        System.out.println("Nouvelle surface : " + rect.surface());
    }
}

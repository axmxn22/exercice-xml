public class UtilTabsans {
    public double somme(double[] tab) {
        double somme = 0;
        for (double val : tab) {
            somme += val;
        }
        return somme;
    }

    public void incre(double[] tab, double increment) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] += increment;
        }
    }

    public void afficher(double[] tab) {
        for (double val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UtilTab util = new UtilTab();
        double[] tab = {1.0, 2.0, 3.0};
        System.out.println("Somme : " + util.somme(tab));
        util.incre(tab, 1.5);
        System.out.print("Tableau après incrément : ");
        util.afficher(tab);
    }
}

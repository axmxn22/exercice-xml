public class TableauUtilitaire {
    public static void affiche(double[][] t) {
        for (double[] ligne : t) {
            for (double val : ligne) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static boolean regulier(double[][] t) {
        int longueur = t[0].length;
        for (double[] ligne : t) {
            if (ligne.length != longueur) {
                return false;
            }
        }
        return true;
    }

    public static double[] sommeLignes(double[][] t) {
        double[] sommes = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            for (double val : t[i]) {
                sommes[i] += val;
            }
        }
        return sommes;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2) || t1.length != t2.length || t1[0].length != t2[0].length) {
            return null;
        }
        double[][] result = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                result[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return result;
    }
}

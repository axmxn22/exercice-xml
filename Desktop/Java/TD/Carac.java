public class Carac {
    private char caractere;

    public Carac(char caractere) {
        this.caractere = caractere;
    }

    public Carac() {
        this.caractere = ' ';
    }

    public boolean estVoyelle() {
        return "aeiouAEIOU".indexOf(this.caractere) != -1;
    }

    public static void main(String[] args) {
        Carac c1 = new Carac('a');
        Carac c2 = new Carac();
        System.out.println("c1 est voyelle ? " + c1.estVoyelle());
        System.out.println("c2 est voyelle ? " + c2.estVoyelle());
    }
}

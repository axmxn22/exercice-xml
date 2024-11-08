public class HelloWorldavecAttribut {

    String maChaine;
    public void Hello() {
        System.out.println(this.maChaine);
    }

    public static void main(String[] args) {
        HelloWorldavecAttribut s = new HelloWorlavecAttribut();
        s.maChaine = "Salut";
        s.Hello();
    }
}

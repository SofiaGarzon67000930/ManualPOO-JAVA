public class PruebaReloj {
    public static void main(String[] args) {
        RelojAjedrez rapido = new RelojAjedrez();
        RelojAjedrez blitz = new RelojAjedrez(3);
        rapido.mostrar();
        blitz.mostrar();
    }
}

public class PruebaJugador {
    public static void main(String[] args) {
        Jugador ana = new Jugador("Ana", 1650);
        System.out.println(ana.getNombre() + " tiene " + ana.getRating() + " puntos de rating");

        ana.setRating(1672);   // la federación actualizó su rating
        System.out.println(ana.getNombre() + " tiene " + ana.getRating() + " puntos de rating");

        ana.setRating(-20);
        System.out.println("Esta línea no se alcanza a ejecutar");
    }
}

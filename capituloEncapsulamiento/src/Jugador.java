public class Jugador {
    private final String nombre;
    private int rating;
    private double puntos;   // puntos acumulados en el torneo

    public Jugador(String nombre, int rating) {
        this.nombre = nombre;
        this.rating = validarRating(rating);
    }

    public String getNombre() {
        return nombre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = validarRating(rating);
    }

    public double getPuntos() {
        return puntos;
    }

    public void sumarPuntos(double puntosGanados) {
        puntos = puntos + puntosGanados;
    }

    private int validarRating(int rating) {
        if (rating < 0) {
            throw new IllegalArgumentException("El rating no puede ser negativo: " + rating);
        }
        return rating;
    }
}

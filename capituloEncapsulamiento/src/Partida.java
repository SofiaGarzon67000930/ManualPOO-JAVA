public class Partida {
    private final Jugador blancas;
    private final Jugador negras;
    private final Tablero tablero;
    private final RelojAjedrez reloj;

    public Partida(Jugador blancas, Jugador negras) {
        this.blancas = blancas;
        this.negras = negras;
        this.tablero = new Tablero();
        this.reloj = new RelojAjedrez();
    }

    public void colocar(Torre torre) {
        tablero.colocar(torre);
    }

    public void mover(Torre torre, char columna, int fila) {
        tablero.moverTorre(torre, columna, fila);
    }

    public void mostrar() {
        System.out.println(blancas.getNombre() + " (blancas) contra "
                + negras.getNombre() + " (negras)");
        tablero.mostrar();
    }

    public void mostrarReloj() {
        reloj.mostrar();
    }

    public void registrarResultado(String resultado) {
        switch (resultado) {
            case "1-0" -> blancas.sumarPuntos(1);
            case "0-1" -> negras.sumarPuntos(1);
            case "1/2-1/2" -> {
                blancas.sumarPuntos(0.5);
                negras.sumarPuntos(0.5);
            }
            default -> System.out.println("Resultado no reconocido: " + resultado);
        }
    }
}

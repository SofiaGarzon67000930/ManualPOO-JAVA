public class RelojAjedrez {
    private int segundosBlancas;
    private int segundosNegras;
    private boolean turnoBlancas;

    public RelojAjedrez() {
        this(10);
    }

    public RelojAjedrez(int minutos) {
        segundosBlancas = minutos * 60;
        segundosNegras = minutos * 60;
        turnoBlancas = true;
    }

    public void descontarSegundo() {
        if (turnoBlancas) {
            segundosBlancas--;
        } else {
            segundosNegras--;
        }
    }

    public void cambiarTurno() {
        turnoBlancas = !turnoBlancas;
    }

    public void mostrar() {
        System.out.println("Blancas: " + segundosBlancas + " s | Negras: "
                + segundosNegras + " s");
    }
}

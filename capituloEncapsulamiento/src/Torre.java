public class Torre {
    private static final int TAMANO = 8;   // casillas por lado del tablero
    private static int torresCreadas = 0;

    private final String color;
    private int indiceColumna;   // 0 es la columna a; 7, la columna h
    private int indiceFila;      // 0 es la fila 8; 7, la fila 1 (como en Tablero)

    public Torre(String color, char columna, int fila) {
        if (!esCasillaValida(columna, fila)) {
            throw new IllegalArgumentException("No existe la casilla " + columna + fila);
        }
        this.color = color;
        indiceColumna = columna - 'a';
        indiceFila = TAMANO - fila;
        torresCreadas++;
    }

    public Torre(String color, String casilla) {
        this(color, casilla.charAt(0), Integer.parseInt(casilla.substring(1)));
    }

    public static int getTorresCreadas() {
        return torresCreadas;
    }

    public String getColor() {
        return color;
    }

    public char getColumna() {
        return (char) ('a' + indiceColumna);
    }

    public int getFila() {
        return TAMANO - indiceFila;
    }

    public String getPosicion() {
        return "" + getColumna() + getFila();
    }

    public void mostrarInformacion() {
        System.out.println("Torre " + color + " en " + getPosicion());
    }

    public boolean puedeMoverA(char columnaDestino, int filaDestino) {
        boolean mismaColumna = indiceColumna == columnaDestino - 'a';
        boolean mismaFila = indiceFila == TAMANO - filaDestino;
        return esCasillaValida(columnaDestino, filaDestino)
                && (mismaColumna || mismaFila)
                && !(mismaColumna && mismaFila);
    }

    public void moverA(char columnaDestino, int filaDestino) {
        if (puedeMoverA(columnaDestino, filaDestino)) {
            indiceColumna = columnaDestino - 'a';
            indiceFila = TAMANO - filaDestino;
            System.out.println("La Torre " + color + " se movió a " + getPosicion());
        } else {
            System.out.println("Movimiento inválido para la Torre " + color
                    + ": " + columnaDestino + filaDestino);
        }
    }

    public void moverA(String casilla) {
        moverA(casilla.charAt(0), Integer.parseInt(casilla.substring(1)));
    }

    private static boolean esCasillaValida(char c, int f) {
        return c >= 'a' && c < 'a' + TAMANO && f >= 1 && f <= TAMANO;
    }
}

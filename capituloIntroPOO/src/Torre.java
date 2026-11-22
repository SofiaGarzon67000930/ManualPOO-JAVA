public class Torre {
    private String color;
    private char columna;
    private int fila;

    public void colocar(String nuevoColor, char nuevaColumna, int nuevaFila) {
        if (esCasillaValida(nuevaColumna, nuevaFila)) {
            color = nuevoColor;
            columna = nuevaColumna;
            fila = nuevaFila;
        } else {
            System.out.println("No se puede colocar la Torre en "
                    + nuevaColumna + nuevaFila);
        }
    }

    public String obtenerPosicion() {
        return "" + columna + fila;
    }

    public void mostrarInformacion() {
        System.out.println("Torre " + color + " en " + obtenerPosicion());
    }

    public boolean puedeMoverA(char columnaDestino, int filaDestino) {
        boolean mismaColumna = columna == columnaDestino;
        boolean mismaFila = fila == filaDestino;
        return esCasillaValida(columnaDestino, filaDestino)
                && (mismaColumna || mismaFila)
                && !(mismaColumna && mismaFila);
    }

    public void moverA(char columnaDestino, int filaDestino) {
        if (puedeMoverA(columnaDestino, filaDestino)) {
            columna = columnaDestino;
            fila = filaDestino;
            System.out.println("La Torre " + color + " se movió a " + obtenerPosicion());
        } else {
            System.out.println("Movimiento inválido para la Torre " + color
                    + ": " + columnaDestino + filaDestino);
        }
    }

    private boolean esCasillaValida(char c, int f) {
        return c >= 'a' && c <= 'h' && f >= 1 && f <= 8;
    }
}

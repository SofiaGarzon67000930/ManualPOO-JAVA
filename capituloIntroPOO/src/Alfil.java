public class Alfil {
    private String color;
    private char columna;
    private int fila;

    public void colocar(String nuevoColor, char nuevaColumna, int nuevaFila) {
        if (esCasillaValida(nuevaColumna, nuevaFila)) {
            color = nuevoColor;
            columna = nuevaColumna;
            fila = nuevaFila;
        } else {
            System.out.println("No se puede colocar el Alfil en "
                    + nuevaColumna + nuevaFila);
        }
    }

    public String obtenerPosicion() {
        return "" + columna + fila;
    }

    public void mostrarInformacion() {
        System.out.println("Alfil " + color + " en " + obtenerPosicion());
    }

    public boolean puedeMoverA(char columnaDestino, int filaDestino) {
        int columnasAvanzadas = Math.abs(columnaDestino - columna);
        int filasAvanzadas = Math.abs(filaDestino - fila);
        return esCasillaValida(columnaDestino, filaDestino)
                && columnasAvanzadas == filasAvanzadas
                && columnasAvanzadas > 0;
    }

    public void moverA(char columnaDestino, int filaDestino) {
        if (puedeMoverA(columnaDestino, filaDestino)) {
            columna = columnaDestino;
            fila = filaDestino;
            System.out.println("El Alfil " + color + " se movió a " + obtenerPosicion());
        } else {
            System.out.println("Movimiento inválido para el Alfil " + color
                    + ": " + columnaDestino + filaDestino);
        }
    }

    private boolean esCasillaValida(char c, int f) {
        return c >= 'a' && c <= 'h' && f >= 1 && f <= 8;
    }
}

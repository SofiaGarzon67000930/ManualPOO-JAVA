public class MovimientoTorre {
    public static void main(String[] args) {
        char columnaOrigen = 'a';
        int filaOrigen = 1;
        char columnaDestino = 'c';
        int filaDestino = 3;

        boolean mismaColumna = columnaOrigen == columnaDestino;
        boolean mismaFila = filaOrigen == filaDestino;

        if (filaDestino < 1 || filaDestino > 8) {
            System.out.println("La fila destino no existe en el tablero.");
        } else if (mismaColumna && mismaFila) {
            System.out.println("La Torre ya está en esa casilla.");
        } else if (mismaColumna || mismaFila) {
            System.out.println("Movimiento válido: la Torre va a "
                    + columnaDestino + filaDestino);
        } else {
            System.out.println("Movimiento inválido: la Torre solo se mueve en línea recta.");
        }
    }
}

public class Operadores {
    public static void main(String[] args) {
        // La Torre va de a1 a a5
        char columnaOrigen = 'a';
        int filaOrigen = 1;
        char columnaDestino = 'a';
        int filaDestino = 5;

        boolean mismaColumna = columnaOrigen == columnaDestino;
        boolean mismaFila = filaOrigen == filaDestino;
        System.out.println("¿Misma columna? " + mismaColumna);
        System.out.println("¿Misma fila? " + mismaFila);

        boolean lineaRecta = mismaColumna || mismaFila;
        boolean seQuedaQuieta = mismaColumna && mismaFila;
        boolean movimientoValido = lineaRecta && !seQuedaQuieta;
        System.out.println("¿Movimiento válido para la Torre? " + movimientoValido);

        int turno = 1;
        turno++;
        int capturas = 0;
        capturas += 2;
        System.out.println("Turno: " + turno + ", capturas: " + capturas);
    }
}

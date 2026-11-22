public class Tablero {
    public static final int TAMANO = 8;

    private final Torre[][] casillas;

    public Tablero() {
        casillas = new Torre[TAMANO][TAMANO];   // todas las casillas empiezan en null
    }

    public void colocar(Torre torre) {
        int fila = indiceFila(torre.getFila());
        int columna = indiceColumna(torre.getColumna());
        if (casillas[fila][columna] == null) {
            casillas[fila][columna] = torre;
        } else {
            System.out.println("La casilla " + torre.getPosicion() + " ya está ocupada");
        }
    }

    public void moverTorre(Torre torre, char columnaDestino, int filaDestino) {
        int filaOrigen = indiceFila(torre.getFila());
        int columnaOrigen = indiceColumna(torre.getColumna());

        if (casillas[filaOrigen][columnaOrigen] != torre) {
            System.out.println("Esa Torre no está en este tablero");
        } else if (!torre.puedeMoverA(columnaDestino, filaDestino)) {
            System.out.println("Movimiento inválido para la Torre " + torre.getColor()
                    + ": " + columnaDestino + filaDestino);
        } else if (!caminoLibre(filaOrigen, columnaOrigen,
                indiceFila(filaDestino), indiceColumna(columnaDestino))) {
            System.out.println("El camino de la Torre " + torre.getColor() + " hacia "
                    + columnaDestino + filaDestino + " está bloqueado");
        } else {
            Torre ocupante = casillas[indiceFila(filaDestino)][indiceColumna(columnaDestino)];
            if (ocupante != null && ocupante.getColor().equals(torre.getColor())) {
                System.out.println("En " + columnaDestino + filaDestino
                        + " hay una pieza del mismo color");
            } else {
                if (ocupante != null) {
                    System.out.println("La Torre " + torre.getColor() + " captura a la Torre "
                            + ocupante.getColor());
                }
                casillas[filaOrigen][columnaOrigen] = null;
                torre.moverA(columnaDestino, filaDestino);
                casillas[indiceFila(filaDestino)][indiceColumna(columnaDestino)] = torre;
            }
        }
    }

    public void mostrar() {
        for (int f = 0; f < TAMANO; f++) {
            System.out.print((TAMANO - f) + " ");
            for (int c = 0; c < TAMANO; c++) {
                Torre torre = casillas[f][c];
                if (torre == null) {
                    System.out.print(". ");
                } else if (torre.getColor().equals("blanca")) {
                    System.out.print("T ");
                } else {
                    System.out.print("t ");
                }
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private boolean caminoLibre(int filaOrigen, int columnaOrigen,
                                int filaDestino, int columnaDestino) {
        int pasoFila = Integer.signum(filaDestino - filaOrigen);         // -1, 0 o 1
        int pasoColumna = Integer.signum(columnaDestino - columnaOrigen);
        int f = filaOrigen + pasoFila;
        int c = columnaOrigen + pasoColumna;
        while (f != filaDestino || c != columnaDestino) {
            if (casillas[f][c] != null) {
                return false;
            }
            f = f + pasoFila;
            c = c + pasoColumna;
        }
        return true;
    }

    private static int indiceFila(int fila) {
        return TAMANO - fila;
    }

    private static int indiceColumna(char columna) {
        return columna - 'a';
    }
}

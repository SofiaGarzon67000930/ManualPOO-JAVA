/**
 * Representa un tablero de ajedrez como una matriz de 8 x 8 caracteres.
 *
 * <p>Cada casilla guarda la letra de la pieza que la ocupa: mayúscula para
 * las blancas, minúscula para las negras y un punto para una casilla vacía.
 * Se usa la notación española: T (Torre), C (Caballo), A (Alfil),
 * D (Dama), R (Rey) y P (Peón).</p>
 *
 * @author Su nombre
 * @version 1.0
 */
public class Tablero {

    /**
     * Punto de entrada del programa. Crea el tablero con la posición
     * inicial, lo muestra y consulta la casilla e1.
     *
     * @param args argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        char[][] tablero = crearTableroInicial();
        imprimirTablero(tablero);
        System.out.println("En e1 está: " + tablero[indiceFila(1)][indiceColumna('e')]);
        System.out.println("¿Existe la casilla i9? " + esCasillaValida('i', 9));
    }

    /**
     * Crea un tablero con las piezas en su posición inicial.
     *
     * @return una matriz de 8 x 8 con la posición inicial de la partida
     */
    public static char[][] crearTableroInicial() {
        char[][] tablero = new char[8][8];
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                tablero[f][c] = '.';
            }
        }
        String mayores = "TCADRACT";
        for (int c = 0; c < 8; c++) {
            tablero[0][c] = Character.toLowerCase(mayores.charAt(c));
            tablero[1][c] = 'p';
            tablero[6][c] = 'P';
            tablero[7][c] = mayores.charAt(c);
        }
        return tablero;
    }

    /**
     * Muestra el tablero en la consola, con la fila 8 arriba y las letras
     * de las columnas abajo, como lo ve el jugador de las blancas.
     *
     * @param tablero la matriz de 8 x 8 que se va a mostrar
     */
    public static void imprimirTablero(char[][] tablero) {
        for (int f = 0; f < 8; f++) {
            System.out.print((8 - f) + " ");
            for (int c = 0; c < 8; c++) {
                System.out.print(tablero[f][c] + " ");
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    /**
     * Convierte una fila del tablero (1 a 8) en el índice de la matriz.
     *
     * @param fila la fila en notación de ajedrez, de 1 a 8
     * @return el índice de la matriz, de 7 (fila 1) a 0 (fila 8)
     */
    public static int indiceFila(int fila) {
        return 8 - fila;
    }

    /**
     * Convierte una columna del tablero ('a' a 'h') en el índice de la matriz.
     *
     * @param columna la columna en notación de ajedrez, de 'a' a 'h'
     * @return el índice de la matriz, de 0 ('a') a 7 ('h')
     */
    public static int indiceColumna(char columna) {
        return columna - 'a';
    }

    /**
     * Indica si una casilla existe en el tablero.
     *
     * @param columna la columna, se espera de 'a' a 'h'
     * @param fila la fila, se espera de 1 a 8
     * @return {@code true} si la casilla está dentro del tablero;
     *         {@code false} en caso contrario
     */
    public static boolean esCasillaValida(char columna, int fila) {
        return columna >= 'a' && columna <= 'h' && fila >= 1 && fila <= 8;
    }
}

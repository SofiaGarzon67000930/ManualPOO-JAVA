public class CasillasDeLaTorre {
    public static void main(String[] args) {
        char columna = 'd';
        int fila = 4;

        System.out.print("Casillas de la columna " + columna + ": ");
        for (int f = 1; f <= 8; f++) {
            if (f != fila) {
                System.out.print("" + columna + f + " ");
            }
        }
        System.out.println();

        System.out.print("Casillas de la fila " + fila + ": ");
        for (char c = 'a'; c <= 'h'; c++) {
            if (c != columna) {
                System.out.print("" + c + fila + " ");
            }
        }
        System.out.println();
    }
}

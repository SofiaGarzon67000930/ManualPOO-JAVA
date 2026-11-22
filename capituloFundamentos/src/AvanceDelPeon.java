public class AvanceDelPeon {
    public static void main(String[] args) {
        int fila = 2;          // un peón blanco empieza en la fila 2
        int movimientos = 0;

        while (fila < 8) {
            fila++;
            movimientos++;
            System.out.println("El peón avanza a la fila " + fila);
        }

        System.out.println("¡Coronación en " + movimientos + " movimientos!");
    }
}

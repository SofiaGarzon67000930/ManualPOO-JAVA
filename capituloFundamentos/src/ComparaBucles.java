public class ComparaBucles {
    public static void main(String[] args) {
        int fila = 8;

        System.out.println("Con while:");
        while (fila < 8) {
            System.out.println("  Revisando la fila " + fila);
            fila++;
        }

        fila = 8;
        System.out.println("Con do-while:");
        do {
            System.out.println("  Revisando la fila " + fila);
            fila++;
        } while (fila < 8);
    }
}

public class PartidaSinObjetos {
    public static void main(String[] args) {
        // Cada dato de una pieza vive en un arreglo distinto.
        // La pieza número i está repartida en la posición i de los cuatro arreglos.
        String[] nombres = {"Torre", "Alfil", "Torre"};
        String[] colores = {"blanca", "blanca", "negra"};
        char[] columnas = {'a', 'c', 'h'};
        int[] filas = {1, 1, 8};

        // Mover la Torre blanca (pieza 0) a a5
        columnas[0] = 'a';
        filas[0] = 5;

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " " + colores[i] + " en "
                    + columnas[i] + filas[i]);
        }
    }
}

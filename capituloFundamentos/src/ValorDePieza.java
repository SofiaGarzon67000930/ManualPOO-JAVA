public class ValorDePieza {
    public static void main(String[] args) {
        char pieza = 'C';
        int valor;

        switch (pieza) {
            case 'P' -> valor = 1;
            case 'C', 'A' -> valor = 3;
            case 'T' -> valor = 5;
            case 'D' -> valor = 9;
            case 'R' -> valor = 0;   // el Rey no se puede capturar
            default -> valor = -1;   // letra desconocida
        }

        if (valor == -1) {
            System.out.println("La letra " + pieza + " no corresponde a ninguna pieza.");
        } else {
            System.out.println("La pieza " + pieza + " vale " + valor + " puntos.");
        }
    }
}

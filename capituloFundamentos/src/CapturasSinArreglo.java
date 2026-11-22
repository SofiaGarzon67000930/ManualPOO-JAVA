public class CapturasSinArreglo {
    public static void main(String[] args) {
        String captura1 = "Peón";
        String captura2 = "Caballo";
        String captura3 = "Peón";
        String captura4 = "Alfil";

        int peones = 0;
        if (captura1.equals("Peón")) {
            peones++;
        }
        if (captura2.equals("Peón")) {
            peones++;
        }
        if (captura3.equals("Peón")) {
            peones++;
        }
        if (captura4.equals("Peón")) {
            peones++;
        }
        System.out.println("Peones capturados: " + peones);
    }
}

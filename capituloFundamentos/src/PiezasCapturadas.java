public class PiezasCapturadas {
    public static void main(String[] args) {
        String[] capturadas = {"Peón", "Caballo", "Peón", "Alfil"};

        System.out.println("Primera captura: " + capturadas[0]);
        System.out.println("Total de capturas: " + capturadas.length);

        int peones = 0;
        for (int i = 0; i < capturadas.length; i++) {
            System.out.println((i + 1) + ". " + capturadas[i]);
            if (capturadas[i].equals("Peón")) {
                peones++;
            }
        }
        System.out.println("Peones capturados: " + peones);
    }
}

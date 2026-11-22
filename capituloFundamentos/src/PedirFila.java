import java.util.Scanner;

public class PedirFila {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fila;

        do {
            System.out.print("Escriba una fila del tablero (1 a 8): ");
            fila = teclado.nextInt();
            if (fila < 1 || fila > 8) {
                System.out.println("Esa fila no existe. Intente de nuevo.");
            }
        } while (fila < 1 || fila > 8);

        System.out.println("Fila aceptada: " + fila);
        teclado.close();
    }
}

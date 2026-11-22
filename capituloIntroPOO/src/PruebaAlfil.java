public class PruebaAlfil {
    public static void main(String[] args) {
        Alfil alfil = new Alfil();
        alfil.colocar("blanco", 'c', 1);
        alfil.mostrarInformacion();
        alfil.moverA('f', 4);   // válido: 3 columnas y 3 filas
        alfil.moverA('f', 6);   // inválido: no es diagonal
        alfil.moverA('f', 4);   // inválido: ya está ahí
        alfil.mostrarInformacion();
    }
}

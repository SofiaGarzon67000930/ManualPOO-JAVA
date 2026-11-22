public class Partida {
    public static void main(String[] args) {
        Torre torreBlanca = new Torre();
        torreBlanca.colocar("blanca", 'a', 1);
        torreBlanca.mostrarInformacion();

        torreBlanca.moverA('a', 5);
        torreBlanca.moverA('c', 7);
        System.out.println("Posición actual: " + torreBlanca.obtenerPosicion());

        Torre torreNegra = new Torre();
        torreNegra.colocar("negra", 'h', 15);   // casilla inexistente
    }
}

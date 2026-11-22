public class Torneo {
    public static void main(String[] args) {
        Jugador ana = new Jugador("Ana", 1650);
        Jugador luis = new Jugador("Luis", 1580);

        Partida ronda1 = new Partida(ana, luis);
        Torre torreBlanca = new Torre("blanca", 'a', 1);
        Torre torreNegra = new Torre("negra", 'a', 8);
        Torre otraNegra = new Torre("negra", 'a', 4);
        ronda1.colocar(torreBlanca);
        ronda1.colocar(torreNegra);
        ronda1.colocar(otraNegra);

        ronda1.mover(torreBlanca, 'a', 8);   // a4 está en el camino
        ronda1.mover(torreBlanca, 'a', 4);   // captura en a4
        ronda1.mostrar();
    }
}

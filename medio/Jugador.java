package medio;

public class Jugador {
    private Carta[] cartas;
    private String nombre;
    private int credito = 1000;

    // constructores
    Jugador(String nombre) {
        this.nombre = nombre;
    }

    Jugador(String nombre, int credito) {
        this.nombre = nombre;
        this.credito = credito;
    }
}

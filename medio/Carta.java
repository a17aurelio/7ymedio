package medio;

public class Carta {
    private String palo;
    private int valor;

    // constructor
    Carta(Palos palo, int valor) {
        this.palo = palo.name();
        this.valor = valor;
    }

    Carta(String palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    // métodos
    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "[" + palo + ": " + valor + "]";
    }
}
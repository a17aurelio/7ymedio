package medio;

public class Baraja {
    private Carta[] naipe;

    // constructor
    Baraja() {
        this.naipe =  new Carta[40];
        for (Palos p : Palos.values()) {
            int x = p.ordinal(), c=1;
            int v = (x > 0) ? (10 * x)+1 : 1;
            for (int i = v; i < 41; i++) {
                naipe[i - 1] = new Carta(p.name(), c++);
                if (i % 10 == 0)
                    break;
            }
        }
    }

    public void salida() {
        for (Carta c : naipe) {
            System.out.println(c);
        }
    }

}

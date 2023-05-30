import java.util.Random;

class volado {
    private Random moneda;

    public volado() {
        moneda = new Random();
    }

    public Voladoo lanzar() {
        int resultado = moneda.nextInt(2); // 0 representa cara, 1 representa cruz

        if (resultado == 0) {
            return Voladoo.CARA;
        } else {
            return Voladoo.SOL;
        }
    }
}

enum Voladoo {
    CARA,
    SOL
}

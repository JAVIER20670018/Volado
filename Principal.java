public class Principal {
    public static void main(String[] args) {
        volado volado = new volado();
        int numtiros = 12;

        for (int i = 1; i <= numtiros; i++) {
            Voladoo resultado = volado.lanzar();
            System.out.println("Tiro " + i + ": " + resultado);
        }
    }
}
public class Methodentraining {

    static long potenz(int basis, int exponent) {
        long ergebnis = 1;
        for (int i = 0; i < exponent; i++) {
            ergebnis = ergebnis * basis;
        }
        return ergebnis;
    }

    static boolean istGerade(int zahl) {
        return zahl % 2 == 0;
    }

    static void begruessen(String name) {
        System.out.println("Hallo " + name);
    }

    static int quadrat(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        System.out.println("Methodentraining");
        System.out.println(quadrat(7)); // 49
        System.out.println(istGerade(4)); // true
        begruessen("Bo"); // Hallo Bo
        System.out.println(potenz(2, 10)); // 1024
    }

}
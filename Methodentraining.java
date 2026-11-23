public class Methodentraining {

    static boolean istGerade(int zahl) {
        return zahl % 2 == 0;
    }

    static int quadrat(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        System.out.println("Methodentraining");
        System.out.println(quadrat(7)); // 49
        System.out.println(istGerade(4)); // true
    }

}
public class Methodentraining {

    static void begruessen(String name) {
        System.out.println("Hallo " + name);
    }

    static int quadrat(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        System.out.println("Methodentraining");
        System.out.println(quadrat(7)); // 49
        begruessen("Bo"); // Hallo Bo
    }

}
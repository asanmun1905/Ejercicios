public class Ej02_05 {
    public static void main(String[] args) {
        double euros;
        double pesetas = 100000;

        euros = pesetas / 166.386;
        System.out.printf("%d pesetas son %.2f euros.%n", (int)pesetas, euros);
    }
}

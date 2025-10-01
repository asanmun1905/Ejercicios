public class Ej02_04 {
    public static void main(String[] args) {
        double euros = 6.0;
        double pesetas;

        pesetas = euros * 166.386;
        System.out.printf("%.1f euros son %d pesetas.%n", euros, (int)pesetas);
    }
}

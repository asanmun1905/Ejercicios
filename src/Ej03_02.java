public class Ej03_02 {
    public static void main(String[] args) {
        System.out.print("Introduzca los euros: ");
        float euros = Float.parseFloat(System.console().readLine());
        System.out.printf("%.2f euros son %d pesetas.", euros, (int)(euros * 166.386));
    }
}

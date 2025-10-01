public class Ej02_06 {
    public static void main(String[] args) {
        double base = 22.75;
        double iva = 0.21 * base;
        double total = base + iva;

        System.out.printf("%-20s%.2f%n", "Base imponible", base);
        System.out.printf("%-21s%.2f%n", "IVA", iva);
        System.out.println("-------------------------");
        System.out.printf("%-20s%.2f", "Total", total);
    }
}

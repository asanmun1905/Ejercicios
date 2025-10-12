public class Ej03_05 {
    public static void main(String[] args) {
        System.out.print("Introduzca la base del rectángulo: ");
        float base = Float.parseFloat(System.console().readLine());
        System.out.print("Introduzca la altura del rectángulo: ");
        float altura = Float.parseFloat(System.console().readLine());
        System.out.printf("El área del rectángulo es %.2fm", base*altura);
    }
}

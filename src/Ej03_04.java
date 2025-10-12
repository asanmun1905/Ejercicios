public class Ej03_04 {
    public static void main(String[] args) {
        System.out.print("Introduzca el primer número: ");
        float num1 = Float.parseFloat(System.console().readLine());
        System.out.print("Introduzca el segundo número: ");
        float num2 = Float.parseFloat(System.console().readLine());
        System.out.printf("""
                            %.2f + %.2f = %.2f
                            %.2f - %.2f = %.2f
                            %.2f * %.2f = %.2f
                            %.2f / %.2f = %.2f""", num1, num2, num1 + num2, num1, num2, num1 - num2, num1, num2, num1 * num2, num1, num2, num1 / num2);
    }
}

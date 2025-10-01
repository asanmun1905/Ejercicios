import java.util.Scanner;

public class Ej03_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa multiplica dos números enteros.");
        System.out.println("Por favor, introduzca el primer número: ");
        int num1 = s.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int num2 = s.nextInt();
        System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
        s.close();
    }
}

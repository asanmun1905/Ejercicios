import java.util.Scanner;

public class Ej03_01 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        try {
            
            System.out.println("Este programa multiplica dos números enteros.");
            System.out.println("Por favor, introduzca el primer número: ");
            int num1 = sc.nextInt();
            System.out.println("Introduzca el segundo número: ");
            int num2 = sc.nextInt();
            System.out.printf("%d * %d = %d", num1, num2, num1 * num2);  
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally{
            sc.close();
        }
    }
}

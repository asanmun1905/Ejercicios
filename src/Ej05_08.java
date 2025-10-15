public class Ej05_08 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(System.console().readLine());
        for (int i = 0; i <=10;i++)
        {
            System.out.printf("%d x %d = %d%n", num, i, num*i);
        }
    }
}

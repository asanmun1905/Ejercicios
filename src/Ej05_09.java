public class Ej05_09 {
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        int num = Integer.parseInt(System.console().readLine());
        int c = 1;
        while (num / 10 != 0)
        {
            num /= 10;
            c++;
        }
        System.out.printf("Tu número tiene %d dígitos", c);
    }
}

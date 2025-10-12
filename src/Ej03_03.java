public class Ej03_03 {
    public static void main(String[] args) {
        System.out.print("Introduzca las pesetas: ");
        int pesetas = Integer.parseInt(System.console().readLine());
        System.out.printf("%d euros son %.2f euros.", pesetas, pesetas / 166.386);
    }
}
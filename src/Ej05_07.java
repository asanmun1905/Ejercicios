public class Ej05_07 {
    public static void main(String[] args) {
        int i = 4;
        int combinacion = 1234;
        while (i > 0)
        {
            System.out.print("Introduzca la clave de la caja fuerte: ");
            int intentoComb = Integer.parseInt(System.console().readLine());
            if (intentoComb == combinacion){
                System.out.println("Has abierto la caja fuerte");
                return;
            }
            if (intentoComb != combinacion)
                System.out.println("Clave incorrecta");
            i--;
        }
        System.out.println("Lo siento, has agotado las 4 oportunidades."); 
    }
}

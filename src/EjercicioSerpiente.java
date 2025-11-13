public class EjercicioSerpiente {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";
    public static void main(String[] args) throws Exception{
        String cuerpo = System.console().readLine("Introduce el caracter de relleno del cuerpo de la serpiente: ");
        String cabeza = System.console().readLine("Introduce el caracter de relleno de la cabeza de la serpiente: ");
        int longitud = Integer.parseInt(System.console().readLine("Introduce la longitud de la serpiente"));
        int posicion = 10;
        int ultimaPosicion = posicion;
        do { 
            for (int i = 0; i < ultimaPosicion; i++){
                System.out.print(" ");
            }
            for (int i = 0; i<longitud;i++)
            {
                System.out.print("  ");
                for (int j = 0; j < 3+(int)(Math.random()*3-1); j++)
                {
                    posicion = Math.min(10, Math.max(0, ultimaPosicion + (int)(Math.random()*3-1)));
                    System.out.printf("%s", (i<longitud)?cuerpo:cabeza);
                }
                System.out.print("*");
                ultimaPosicion = posicion;
            }
            Thread.sleep(100);
            System.out.print(CLEAN_SCREEN);
        } while (true);
    }
}

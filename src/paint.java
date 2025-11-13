public class paint {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";
    public static void main(String[] args) {
        System.out.print("Introduzca el ancho del canvas: ");
        int ancho = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el alto del canvas: ");
        int alto = Integer.parseInt(System.console().readLine());
        int x = ancho/2;
        int y = alto/2;
        boolean salir = false;
        do { 
            for (int i = 0; i<alto; i++)
            {
                for(int j = 0; j < ancho;j++){
                    if(i==0 || j==0 || i == alto-1 || j == ancho-1)
                        System.out.print("* ");
                    else if (i == y && j == x)
                        System.out.print("M ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
            System.out.println("W. Arriba");
            System.out.println("A. Izquierda");
            System.out.println("S. Abajo");
            System.out.println("D. Derecha");
            char opcion = System.console().readLine().toUpperCase().charAt(0);
            switch(opcion){
                case 'W':
                    y = Math.max(1, y-1);
                    break;
                case 'A':
                    x = Math.max(1, x-1);
                    break;
                case 'S':
                    y = Math.min(1, y+1);
                    break;
                case 'D':
                    x = Math.min(1, x+1);
                    break;
            }
            System.out.print(CLEAN_SCREEN);
        } while (!salir);
        
    }
}

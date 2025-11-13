public class rebote {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";
    public static void main(String[] args) throws Exception{
        System.out.print("Introduzca el ancho del canvas: ");
        int ancho = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el alto del canvas: ");
        int alto = Integer.parseInt(System.console().readLine());
        int x = (int)(Math.random()*(ancho-2)+2);
        int y = (int)(Math.random()*(alto-2)+2);
        boolean salir = false;
        int vx = 0;
        int vy = 0;

        do { 
            for(int i = 0;i<alto;i++)
            {
                for(int j = 0;j<ancho;j++)
                {
                    if (i == 0 || i == alto - 1 || j == 0 || j == ancho - 1)
                        System.out.print("*");
                    else if (i == y-1 && j == x-1)
                        System.out.print("O");
                    else
                        System.out.print(" ");
                    
                }
                System.out.println();
            }
            do { 
                vx = (int)(Math.random()*3-1);
                vy = (int)(Math.random()*3-1);
            } while (vy == 0 || vx == 0);
            x += vx;
            y += vy;
            if (x <= 1 || x >= ancho)
                vx *= -1;
            if (y <= 1 || y >= alto)
                vy *= -1;
            Thread.sleep(300);
            System.out.println(CLEAN_SCREEN);
        } while (!salir);
    }
}

public class Ej05_63_ejemplo {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";
    public static void main(String[] args) throws Exception{
        System.out.print("Introduzca la altura de la primera piramide: ");
        int altura1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la segunda piramide: ");
        int altura2 = Integer.parseInt(System.console().readLine());

        int alturaMax = Math.max(altura1, altura2);
        do { 
            for (int i = 0; i < alturaMax; i++) {
            int nivel1 = i - (alturaMax - altura1);
            int nivel2 = i - (alturaMax - altura2);
            if (nivel1 >= 0) {
                for (int j = 0; j < altura1 + nivel1; j++) 
                    System.out.print(j < altura1 - nivel1 - 1 ? " " : "*");
            } else {
                for (int j = 0; j < altura1 * 2 - 1; j++) System.out.print(" ");
            }
            System.out.print(" ");
            if (nivel2 >= 0) {
                for (int j = 0; j < altura2 + nivel2; j++) {
                    System.out.print(j < altura2 - nivel2 - 1 ?(i>=alturaMax-altura1)?"  ":" " : "*");
                }
            }
            System.out.println();
            }
            Thread.sleep(100);
            System.out.print(CLEAN_SCREEN);
            altura1++;
            if(altura1==11) altura1=1;
            altura1--;        
            if(altura2==0) altura2=10;
        } while (true);
    }
}
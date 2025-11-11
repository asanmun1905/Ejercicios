public class Ej05_63_ejemplo {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la primera piramide: ");
        int altura1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la segunda piramide: ");
        int altura2 = Integer.parseInt(System.console().readLine());

        int alturaMax = Math.max(altura1, altura2);
        
        for (int i = 0; i < alturaMax; i++) {
            int nivel1 = i - (alturaMax - altura1);
            int nivel2 = i - (alturaMax - altura2);

            // --- Primera pirámide ---
            if (nivel1 >= 0) {
                for (int j = 0; j < altura1 + nivel1; j++) {
                    System.out.print(j < altura1 - nivel1 - 1 ? " " : "*");
                }
            } else {
                // Espacios hasta donde iría la base de la primera
                for (int j = 0; j < altura1 * 2 - 1; j++) System.out.print(" ");
            }

            // Espacio entre bases (solo 1)
            System.out.print(" ");

            // --- Segunda pirámide ---
            if (nivel2 >= 0) {
                for (int j = 0; j < altura2 + nivel2; j++) {
                    System.out.print(j < altura2 - nivel2 - 1 ?(i>=alturaMax-altura1)?"  ":" " : "*");
                }
            }

            System.out.println();
        }
    }    
}

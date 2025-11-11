public class Ej05_10 {
    public static void main(String[] args) {
        int num;
        int total = 0;
        int c = 0;
        int media;
        System.out.print("Introduzca los números para los que desea calcular la media: ");
        num = Integer.parseInt(System.console().readLine());
        if (num >= 0){
            do {
            num = Integer.parseInt(System.console().readLine());
            total += num;
            c++;
            }while (num < 0);
            media = total/c;
            System.out.printf("La media es %d", media);
        }
        else
            System.out.println("No has introducido ningún número positivo");
        
    }
}

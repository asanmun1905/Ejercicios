public class Ejercicio4 {
    public static void main(String[] args) {
        final String SSII = "\u001B[36mSSII\u001B[0m";
        final String BBDD = "\u001B[32mBBDD\u001B[0m";
        final String PROG = "\u001B[31mPROG\u001B[0m";
        final String LMSG = "\u001B[33mLMSG\u001B[0m";
        final String SOST = "\u001B[34mSOST\u001B[0m";
        final String IPE = "\u001B[35mIPE\u001B[0m";
        final String DIGI = "\u001B[38;5;250mDIGI\u001B[0m";
        final String EEDD = "\u001B[38;5;65mEEDD\u001B[0m";
    
        System.out.printf("╔═════════════════════════════════════════════╗%n");
        System.out.printf("║ %-18s%-9s%-9s%-9s%-9s%n", "\u001B[1m\u001B[31mLunes", "Martes", "Miérc.", "Jueves", "Viernes\u001B[0m ║");
        System.out.printf("╚═════════════════════════════════════════════╝%n");
        System.out.printf("║ %-18s%-18s%-18s%-18s%-17s%s%n", SSII, PROG, SSII, IPE, BBDD, "║");
        System.out.printf("║ %-18s%-18s%-18s%-18s%-17s%s%n", SSII, PROG, SSII, IPE, BBDD, "║");
        System.out.printf("║ %-18s%-18s%-18s%-18s%-17s%s%n", LMSG, PROG, IPE, PROG, SSII, "║");
        System.out.printf("║ %-18s%-18s%-24s%-18s%-22s%s%n", LMSG, BBDD, DIGI, PROG, EEDD, "║");
        System.out.printf("║ %-18s%-18s%-18s%-18s%-22s%s%n", BBDD, BBDD, PROG, PROG, EEDD, "║");
        System.out.printf("║ %-18s%-18s%-18s%-18s%-22s%s%n", BBDD, SOST, PROG, LMSG, EEDD, "║");
        System.out.printf("╚═════════════════════════════════════════════╝%n");
    }
}

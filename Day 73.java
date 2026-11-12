import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. nasi goreng tanpa nasi");
            System.out.println("2. bubur ayam tanpa bubur");
            System.out.println("3. bakso tanpa tepung");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("memilih nasi goreng tanpa nasi");
                    break;

                case 2:
                    System.out.println("memilih bubur ayam tanpa bubur.");
                    break;

                case 3:
                    System.out.println("memilih bakso tanpa tepung");
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);

        in.close();
    }
}

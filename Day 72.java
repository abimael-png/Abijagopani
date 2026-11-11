import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int angka;
        int jumlah = 0;

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = in.nextInt();

            if (angka < 0) {
                break;
            }

            jumlah = jumlah + angka;
        }

        System.out.println("Total penjumlahan: " + jumlah);

        in.close();
    }
}

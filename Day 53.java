
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka;

        do {
            System.out.print("(Masukkan angka mines untuk menghentikan): ");
            angka = in.nextInt();
        } while (angka >= 0);

        System.out.println("Program selesai!");
        in.close();
    }
}

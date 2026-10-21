
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = in.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah " + hasil);

        in.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();

        System.out.println("Nama asli: " + nama);
        System.out.println("Jumlah karakter: " + nama.length());
        System.out.println("Huruf besar: " + nama.toUpperCase());
        System.out.println("Huruf kecil: " + nama.toLowerCase());

        in.close();
    }
}

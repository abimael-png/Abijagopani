
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah perulangan: ");
        int jumlah = in.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        in.close();
    }
}

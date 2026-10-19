
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nilai: ");
        int nilai = in.nextInt();

        System.out.println("penghasilann orang tua: ");
        double penghasilan = in.nextDouble();

        if (nilai >= 85 && penghasilan <= 3000000) {
            System.out.println("Lolos Beasiswa");
        } else {
            System.out.println("Tidak Lolos Beasiswa");
        }

        in.close();
    }
}

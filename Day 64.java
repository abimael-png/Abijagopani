import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("masukkan angka: ");
        int n = in.nextInt();

        int faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial = faktorial * i;
        }

        System.out.println("Hasil faktorial: " + faktorial);

        in.close();
    }
}

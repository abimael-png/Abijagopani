import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("nilai M: ");
        int m = in.nextInt();

        System.out.print("nilai N: ");
        int n = in.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * m;
        }

        System.out.println("Hasil: " + hasil);

        in.close();
    }
}

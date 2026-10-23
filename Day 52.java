
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka batas: ");
        int batas = in.nextInt();

        int i = 1;

        while (i <= batas) {
            System.out.println("Diulang ke-" + i);
            i++;
        }

        in.close();
    }
              }


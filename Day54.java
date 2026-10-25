
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int angka = in.nextInt();

            if (angka == 0) {
                System.out.println("Program selesai.");
                break;
            }

            if (angka % 2 == 0) {
                System.out.print("Genap ");
            } else {
                System.out.print("Ganjil ");
            }

            if (angka > 0) {
                System.out.println("Positif");
            } else {
                System.out.println("Negatif");
            }
        }

        in.close();
    }
            }

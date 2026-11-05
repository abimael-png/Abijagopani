import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("masukkan jumlah garis: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("|");
        }

        in.close();
    }
        }

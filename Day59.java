
public class Main {
    public static void main(String[] args) {
        int m = 3;
        int n = 20;

        System.out.println("Kelipatan " + m + " dari 1 sampai " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.println(i);
            }
        }
    }
}

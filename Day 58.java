public class Main {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("genap dari n ke 1:");
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(" ganjil dari n ke 1:");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

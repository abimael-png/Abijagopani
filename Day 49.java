

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan winrate:");
        double winrate = in.nextDouble();
      System.out.println((winrate >=60.0)? "gelo jago bgt" : "poke poke");
      in.close();
    }
}

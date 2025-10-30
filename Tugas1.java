import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt();

        if (N < 3) {
            System.out.println("Nilai N minimal 3!");
            return;
        }

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            int M = 5;
            for (int j = 1; j <= M; j++) {
                if (i == 1 || i == M || j == 1 || j == M) {
                    System.out.print(M + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
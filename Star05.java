import java.util.Scanner;

public class Star05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai X : ");
        int X = sc.nextInt();

        for (int i = 1; i <= X; i++) {
            System.out.print("*");
        }
    }
}
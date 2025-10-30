import java.util.Scanner;

public class Square05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai X : ");
        int X = sc.nextInt();

        for (int iOuter = 1; iOuter <= X; iOuter++) {
            for (int i = 1; i <= X; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
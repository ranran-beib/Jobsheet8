import java.util.Scanner;

public class Triangle05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai X : ");
        int X = sc.nextInt();
        int i = 1;

        while (i <= X) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
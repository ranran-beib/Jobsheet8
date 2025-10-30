import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sports = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};
        int athletesPerSport = 5;

        String[][] athleteNames = new String[sports.length][athletesPerSport];

        for (int i = 0; i < sports.length; i++) {
            System.out.println("Masukkan nama 5 atlet terbaik cabang olahraga " + sports[i] + ":");
            for (int j = 0; j < athletesPerSport; j++) {
                System.out.print("Atlet ke-" + (j+1) + ": ");
                athleteNames[i][j] = scanner.nextLine();
            }
            System.out.println(); 
        }

        System.out.println("Informasi nama atlet masing-masing cabang olahraga:");
        for (int i = 0; i < sports.length; i++) {
            System.out.println(sports[i] + ":");
            for (int j = 0; j < athletesPerSport; j++) {
                System.out.println(" - " + athleteNames[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
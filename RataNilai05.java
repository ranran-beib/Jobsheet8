import java.util.Scanner;

public class RataNilai05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int i = 1;
        while (i <= 5) {
            int totNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke-" + i);

            for (int j = 1; j <=5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                int nilaiMhs = sc.nextInt();
                totNilai += nilaiMhs;
            }

            double rataNilai = (double) totNilai / 5;
            System.out.println("Rata-rata Nilai Mahasiswa ke-" + i + " adalah " + rataNilai);
            System.out.println();
            i++;
        }

        sc.close();
    }
}

//Percobaan 4//
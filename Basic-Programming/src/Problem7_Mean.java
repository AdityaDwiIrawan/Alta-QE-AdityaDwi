import java.util.Scanner;

public class Problem7_Mean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        System.out.println("==========Mean==========");

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan jumlah nilai: ");
            int jumlahNilai = scanner.nextInt();

            float[] nilai = new float[jumlahNilai];

            for (int i = 0; i < jumlahNilai; i++) {
                System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
                nilai[i] = scanner.nextInt();
            }

            double rataRata = hitungRataRata(nilai);

            System.out.println("Nilai rata-rata: " + rataRata);

            System.out.print("Apakah Anda ingin melanjutkan (Y/N)? ");
            choice = input.next();
        } while (choice.equalsIgnoreCase("Y"));
    }


    public static double hitungRataRata(float[] nilai) {
        int jumlah = 0;
        for (int i = 0; i < nilai.length; i++) {
            jumlah += nilai[i];
        }

        float rataRata = (float) jumlah / nilai.length;

        return rataRata;
    }
}

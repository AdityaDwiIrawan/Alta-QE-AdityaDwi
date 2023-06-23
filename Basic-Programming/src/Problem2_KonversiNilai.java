import java.util.Scanner;

public class Problem2_KonversiNilai {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nama Mahasiswa : ");
        String inputNama = sc.nextLine();
        System.out.print("Masukkan nilai: ");
        int inputNilai = sc.nextInt();


        String nilaiAnda = "Nilai " + inputNama + " adalah ";


        if ((inputNilai >= 80) && (inputNilai <= 100)) {
            System.out.println(nilaiAnda + "A");
        } else if ((inputNilai >= 65) && (inputNilai <= 79)) {
            System.out.println(nilaiAnda + "B+");
        } else if ((inputNilai >= 50) && (inputNilai <= 64)) {
            System.out.println(nilaiAnda + "B");
        } else if ((inputNilai >= 35) && (inputNilai <= 49)) {
            System.out.println(nilaiAnda + "C");
        } else if ((inputNilai >= 0) && (inputNilai <= 34)) {
            System.out.println("D");
        } else if ((inputNilai <= 0)||(inputNilai >= 100)) {
            System.out.println("invalid number");
        }
    }
}
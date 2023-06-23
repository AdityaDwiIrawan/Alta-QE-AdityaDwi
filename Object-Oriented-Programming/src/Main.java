import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int sisi = sc.nextInt();
    Persegi persegi = new Persegi(sisi);

        System.out.println("Luas segitiga: " + persegi.hitungLuas());
        System.out.println("Keliling segitiga: " + persegi.hitungKeliling());

        double panjang = sc.nextDouble();
        double lebar = sc.nextDouble();
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        System.out.println("Luas Persegi panjang "+ persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi panjang "+ persegiPanjang.hitungKeliling());

        double alas = sc.nextDouble();
        double tinggi = sc.nextDouble();
        Segitiga segitiga = new Segitiga(alas, tinggi);

        System.out.println("Luas Persegi panjang "+ segitiga.hitungLuas());
        System.out.println("Keliling Persegi panjang "+ segitiga.hitungKeliling());

        Persegi hitung = new Persegi(2);
        hitung.hitungLuas();
        hitung.hitungKeliling();

//         int a = new Segitiga(2,4);

    }
}
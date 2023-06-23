import java.util.Scanner;

public class Problem1_LuasSegitiga {
    public static void main(String[] args) {
        System.out.println("Luas dan alas segitiga dalam bentuk cm");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai alas : ");
        float alas = sc.nextFloat();

        System.out.print("Masukan nilai tinggi : ");
        float tinggi = sc.nextFloat();

        float luasSegitiga = alas * tinggi / 2;

        System.out.print("Hasil luas segitiga adalah : "+luasSegitiga+" cm");
    }
}

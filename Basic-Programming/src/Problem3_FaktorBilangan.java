import java.util.Scanner;

public class Problem3_FaktorBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai faktor : ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0){
                System.out.println("nilai ke - "+i);
            }
        }
    }
}

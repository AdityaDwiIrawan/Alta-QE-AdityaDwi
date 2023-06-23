import java.util.Scanner;

public class Problem4_BilanganPrima {
    private static boolean primeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("==========Bilangan Prima==========");
        System.out.print("Masukan bilangan prima : ");
        int number = sc.nextInt();
        if (primeNumber(number)) {
            System.out.println(number+" adalah hasil bilangan prima");
        } else {
            System.out.println(number+" adalah bukan hasil bilangan prima");
        }
    }
}

import java.util.Scanner;

public class Problem5_Palindrome {
    public static boolean isPalindrome(String kata) {
        int left = 0;
        int right = kata.length() - 1;

        while (left < right) {
            if (kata.charAt(left++) != kata.charAt(right--)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        System.out.println("==========Palindrome==========");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukan kata : ");
            String kata = sc.nextLine();

            if (isPalindrome(kata)) {
                System.out.println(kata + " adalah palindrome");
            } else {
                System.out.println(kata + " bukan palindrome");
            }
            System.out.print("Apakah Anda ingin melanjutkan (Y/N)? ");
            choice = input.next();
        } while (choice.equalsIgnoreCase("Y"));
    }
}


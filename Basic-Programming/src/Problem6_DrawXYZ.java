import java.util.Scanner;

public class Problem6_DrawXYZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        System.out.println("============DrawXYZ============");

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukan jumlah pattern : ");
            int height = sc.nextInt();
            drawXYZ(height);

            System.out.print("Apakah Anda ingin melanjutkan (Y/N)? ");
            choice = input.next();
        } while (choice.equalsIgnoreCase("Y"));
    }

    public static void drawXYZ(int height) {
        int count = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                count++;

                if (count % 3 == 0) {
                    System.out.print("X ");
                } else if (count % 2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
            }
            System.out.println();
        }
    }
}
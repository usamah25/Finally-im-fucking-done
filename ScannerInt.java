import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan bilangan 1 : ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukan bilangan 2 : ");
        int bilangan2 = input.nextInt();

        System.out.println("Hasil perkalian : " + (bilangan1 * bilangan2));

        input.close();
    }
}

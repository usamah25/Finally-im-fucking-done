import java.text.*;
import java.util.*;

public class FormatAngkaLokal {
    public static void main (String[] args) {
        double angka = 83243463.343345;
        double angkaPecahan = 0.902235643;

        NumberFormat NumberFormatterGERMANY = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat CurrFormatterGERMANY = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat PercentFormatterGERMANY = NumberFormat.getPercentInstance(Locale.GERMANY);

        String NumberStrGERMANY = NumberFormatterGERMANY.format(angka);
        String CurrStrGERMANY = CurrFormatterGERMANY.format(angka);
        String PercentStrGERMANY = PercentFormatterGERMANY.format(angkaPecahan);

        System.out.println("double angka = " + NumberStrGERMANY + " berformat number : " + NumberStrGERMANY);
        System.out.println("double angka = " + CurrStrGERMANY + " berformat currency : " + CurrStrGERMANY);
        System.out.println("double angka = " + PercentStrGERMANY + " berformat percent : " + PercentStrGERMANY);
        System.out.println();
        System.out.println();

        NumberFormat NumberFormatterUS = NumberFormat.getNumberInstance(Locale.US);
        NumberFormat CurrFormatterUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat PercentFormatterUS = NumberFormat.getPercentInstance(Locale.US);

        String NumberStrUS = NumberFormatterUS.format(angka);
        String CurrStrUS = CurrFormatterUS.format(angka);
        String PercentStrUS = PercentFormatterUS.format(angkaPecahan);

        System.out.println("double angka = " + NumberStrUS + " berformat number : " + NumberStrUS);
        System.out.println("double angka = " + CurrStrUS + " berformat currency : " + CurrStrUS);
        System.out.println("double angka = " + PercentStrUS + " berformat percent : " + PercentStrUS);
    }
}

import java.text.*;

public class FormatAngka {
    public static void main (String[] args) {
        double angka = 83243463.343345;
        double angkaPecahan = 0.902235643;

        NumberFormat NumberFormatter = NumberFormat.getNumberInstance();
        NumberFormat CurrFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat PercentFormatter = NumberFormat.getPercentInstance();

        String NumberStr = NumberFormatter.format(angka);
        String CurrStr = CurrFormatter.format(angka);
        String PercentStr = PercentFormatter.format(angkaPecahan);

        System.out.println("double angka = " + NumberStr + " berformat number : " + NumberStr);
        System.out.println("double angka = " + CurrStr + " berformat currency : " + CurrStr);
        System.out.println("double angka = " + PercentStr + " berformat percent : " + PercentStr);

        System.out.println();
        System.out.println();

        NumberFormatter.setMaximumIntegerDigits(10);
        CurrFormatter.setMaximumIntegerDigits(10);
        PercentFormatter.setMaximumIntegerDigits(10);

        NumberFormatter.setMinimumIntegerDigits(1);
        CurrFormatter.setMinimumIntegerDigits(1); 
        PercentFormatter.setMinimumIntegerDigits(1);

        NumberFormatter.setMaximumFractionDigits(5);    
        CurrFormatter.setMaximumFractionDigits(2);
        PercentFormatter.setMaximumFractionDigits(4);

        NumberFormatter.setMinimumFractionDigits(2);
        CurrFormatter.setMinimumFractionDigits(2);
        PercentFormatter.setMinimumFractionDigits(6);

        System.out.println("double angka = " + angka + " berformat number : " + NumberFormatter.format(angka));
        System.out.println("double angka = " + angka + " berformat number : " + CurrFormatter.format(angka));
        System.out.println("double angka = " + angka + " berformat number : " + PercentFormatter.format(angkaPecahan));
    }
}

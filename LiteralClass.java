import javax.swing.JOptionPane;

public class LiteralClass {
    public static void main (String args[]) {
        System.out.println("Literal java : \'" + '\n' + "slash n");
        System.out.println("Literal java : \'" + '\r' + "slash r");
        System.out.println("Literal java : \'" + '\b' + "slash b");
        System.out.println("Literal java : \'" + '\t' + "slash t");
        System.out.println("Literal java : \'" + '\f' + "slash f");
        System.out.println("Literal java : \'" + '\101' + "slash 101");
        System.out.println("Literal java : \'" + '\u0416' + "slash u406");

        JOptionPane.showMessageDialog(null,"Literal java :\'" + '\u0416' + "\' slash u0416");
    }
}

import javax.swing.JOptionPane;

public class GetInputKeyboardJOptionPane {
    public static void main(String[] args) {
        String nama = "";

        nama = JOptionPane.showInputDialog("Ketik nama anda");
        String msg = "Hello " + nama + "\nLanjutkan belajarnya pasti jadi programmer Java";
        JOptionPane.showMessageDialog(null, msg);
    }
}
import javax.swing.JOptionPane;

public class Tugas1 {
    public static void main (String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan nama anda : ");
        String NIMInput = JOptionPane.showInputDialog("Masukkan nim anda : ");
        long NIM = Long.valueOf(NIMInput);
        String kelas = JOptionPane.showInputDialog("Masukkan Kelas anda");

        String msg = "Nama saya adalah " + nama + "\nNIM Saya " + NIM + "\nKelas " + kelas + "\t Ruang V118";
        JOptionPane.showMessageDialog(null,msg);
    }
}

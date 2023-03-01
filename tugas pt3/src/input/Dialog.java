package input;

import bio.Biodata;

import javax.swing.JOptionPane;

public class Dialog {
    public static void dialogBox() {
        String nama, nim, kelas;
        nama = JOptionPane.showInputDialog("ketik nama anda : ");
        nim = JOptionPane.showInputDialog("ketik nim anda : ");
        kelas = JOptionPane.showInputDialog("ketik kelas anda : ");
        Biodata mhs1 = new Biodata(nama, nim, kelas);
        mhs1.bioShow();
    }

}

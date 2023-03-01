package bio;

import javax.swing.JOptionPane;

public class Biodata {
    protected String nama, nim, kelas;

    public Biodata(String nama, String nim, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void bioShow() {
        String message = "Nim : " + this.nim + "\nNama : " + this.nama + "\nKelas : " + this.kelas;
        JOptionPane.showMessageDialog(null, message);
    }
}

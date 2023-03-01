import persegi.PersegiPanjang;
import aritmatika.Aritmatika;

public class App {
    public static void main(String[] args) throws Exception {
        String nama, kelas, jurusan;
        int usia;

        // mengisi nilai
        nama = "Rio Mulya Syawal";
        kelas = "04TPLP015";
        jurusan = "Teknik Informatika";
        usia = 20;

        System.out.println("Nama \t: " + nama);
        System.out.println("Kelas \t: " + kelas);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Usia \t: " + usia + " Tahun\n");

        PersegiPanjang.luas();
        Aritmatika.outPut();
    }
}

package aritmatika;

public class Aritmatika {

    public static void outPut() {
        int nilaiA = 10, nilaiB = 5;
        boolean hasil;

        // apakah A lebih besar dari B ?
        hasil = nilaiA > nilaiB;
        System.out.println("\nApakah A > B ? : " + hasil);
        hasil = nilaiA < nilaiB;
        System.out.println("Apakah A < B ? : " + hasil);
        hasil = nilaiA >= nilaiB;
        System.out.println("Apakah A >= B ? : " + hasil);
        hasil = nilaiA == nilaiB;
        System.out.println("Apakah A == B ? : " + hasil);
        hasil = nilaiA != nilaiB;
        System.out.println("Apakah A != B ? : " + hasil);
    }
}

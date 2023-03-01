package persegi;

import java.util.Scanner;

public class PersegiPanjang {

    public static void luas() {
        int panjang, lebar;
        double luas;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Input Panjang : ");
        panjang = s.nextInt();
        System.out.print("Input Lebar : ");
        lebar = s.nextInt();
        luas = (double) panjang * lebar;

        System.out.println("Luas Persegi Panjang : " + luas);
        s.close();
    }

}

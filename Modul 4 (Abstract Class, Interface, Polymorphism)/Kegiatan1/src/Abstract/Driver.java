package Abstract;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, s, t;

        System.out.println("\n=== Perhitungan BangunRuang (Kerucut dan Bola) ===\n");
        
        System.out.print("Masukkan Jari-Jari\t: ");
        r = input.nextInt();
        System.out.print("Masukkan Garis Pelukis\t: ");
        s = input.nextInt();
        System.out.print("Masukkan Tinggi\t\t: ");
        t = input.nextInt();
        
        System.out.println("\n==================================================");
        
        Kerucut k = new Kerucut();
        System.out.println("\n=== Kerucut ===\n");
        k.setjari(r);
        k.sets(s);
        k.settinggi(t);
        k.getLuasPermukaan();
        k.getVolume();

        Bola b = new Bola();
        System.out.println("\n=== Bola ===\n");
        b.setjari(r);
        b.getLuasPermukaan();
        b.getVolume();
        
        input.close();
        System.out.println("\n==================================================\n");
    }
}
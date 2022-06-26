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
        k.setjari(r);
        k.sets(s);
        k.settinggi(t);
        k.displaymenu2();

        Bola b = new Bola();
        b.setjari(r);
        b.displaymenu();
        
        input.close();
        System.out.println("\n==================================================\n");
    }
}
package Kegiatan1.src;

public class Main {
    public static void main(String[] args) {
        Prosessor b = new Prosessor();
        Color c = new Color();
        Price d = new Price();

        System.out.println("\nLaptop Specifications\n");
        b.merk_laptop();
        b.prosessor_laptop();
        c.warna_laptop();
        d.harga_laptop();
    }

}

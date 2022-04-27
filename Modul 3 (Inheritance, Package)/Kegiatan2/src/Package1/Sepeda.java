package Kegiatan2.src.Package1;

import Kegiatan2.src.Package2.Yamaha;

public class Sepeda {
    public String asal = "Indonesia";
    private String nama;
    protected void setNama(String nama) {
        this.nama = nama;
    }
    protected String getNama() {
        return nama;
    }
    
    public void type (int a){
        System.out.println("Volume Mesinnya\t: " + a + " CC");
    }
    public void type (double a){
        System.err.println("Fuel Tank\t: " + a + " L");
    }
    public void type (String a){
        System.out.println("Harga Motornya\t: Rp " + a);
    }
    
}

class Main{
    public static void main(String[] args) {
        System.out.println("\n=== Deskripsi Sepeda Motor Terbaru ===\n");

        Yamaha yy = new Yamaha();
        yy.display();
    }
}



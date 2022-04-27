package Kegiatan2.src.Package2;

import Kegiatan2.src.Package1.Sepeda;

public class Yamaha extends Sepeda{
    String asal;
    public void display(){
        asal = "Malaysia";
        System.out.println("Sepeda Motor ini dari " + super.asal);
        Yamaha y = new Yamaha();
        y.setNama("Nmax");
        System.out.println("Nama Sepeda\t: " + y.getNama());
        y.type(155);
        y.type(6.6);
        y.type("28,945,000");

    }
}

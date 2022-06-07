package Kegiatan1.src.Abstract;

public class Kerucut extends BangunRuang{
    double LuasPermukaan, Volume;
    int jari, tinggi, s;

    public void setjari(int jari){
        this.jari = jari;
    }

    public void settinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public void sets(int s){
        this.s = s;
    }

    @Override
    public double getLuasPermukaan(){
        return (3.14 * jari * (jari + s));
    }

    @Override
    public double getVolume(){
        return (3.14 * jari * jari * tinggi * 1/3);
    }

    public void displaymenu2(){
        System.out.println("\n=== Kerucut ===\n");
        System.out.printf("Luas Permukaan Kerucut adalah %.2f\n", getLuasPermukaan());
        System.out.printf("Volume Kerucut adalah %.2f\n", getVolume());
    }
}
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

    void getLuasPermukaan(){
        LuasPermukaan = (3.14 * jari * (jari + s));
        System.out.printf("Luas Permukaan Kerucut adalah %.2f\n", LuasPermukaan);
    }

    void getVolume(){
        Volume = (3.14 * jari * jari * tinggi * 1/3);
        System.out.printf("Volume Kerucut adalah %.2f\n", Volume);
    }
}
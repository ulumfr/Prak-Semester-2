package Kegiatan1.src.Abstract;

public class Bola extends BangunRuang{
    double LuasPermukaan, Volume;
    int jari;

    public void setjari(int jari){
        this.jari = jari;
    }

    void getLuasPermukaan(){
        LuasPermukaan = (4 * 3.14 * jari * jari);
        System.out.printf("Luas Permukaan Bola adalah %.2f\n", LuasPermukaan);
    }

    void getVolume(){
        Volume = (3.14 * jari * jari * jari * 4/3);
        System.out.printf("Volume Bola adalah %.2f\n", Volume);
    }
}
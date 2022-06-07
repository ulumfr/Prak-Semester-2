package Kegiatan1.src.Abstract;

public class Bola extends BangunRuang{
    int jari;

    public void setjari(int jari){
        this.jari = jari;
    }

    @Override
    public double getLuasPermukaan(){
        return (4 * 3.14 * jari * jari);
    }

    @Override
    public double getVolume(){
        return (3.14 * jari * jari * jari * 4/3);
        
    }

    public void displaymenu(){
        System.out.println("\n=== Bola ===\n");
        System.out.printf("Luas Permukaan Bola adalah %.2f\n", getLuasPermukaan());
        System.out.printf("Volume Bola adalah %.2f\n", getVolume());
    }
}
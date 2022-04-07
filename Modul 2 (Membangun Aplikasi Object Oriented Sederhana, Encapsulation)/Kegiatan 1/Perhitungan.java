import java.util.Scanner;

public class Perhitungan {
    
    private int NilaiProgdas;
    private int NilaiKalkulus;
    private int NilaiOrkom;
    private double Hasil;

    public void setNilaiProgdas(int NilaiProgdas) {
        this.NilaiProgdas = NilaiProgdas;
    }

    public int getNilaiProgdas() {
        return NilaiProgdas;
    }

    public void setNilaiKalkulus(int NilaiKalkulus) {
        this.NilaiKalkulus = NilaiKalkulus;
    }

    public int getNilaiKalkulus() {
        return NilaiKalkulus;
    }

    public void setNilaiOrkom(int NilaiOrkom) {
        this.NilaiOrkom = NilaiOrkom;
    }

    public int getNilaiOrkom() {
        return NilaiOrkom;
    }

    public double hitungRata(){
        return Hasil = ( NilaiProgdas + NilaiKalkulus + NilaiOrkom ) / 3.0 ;
    }

    public void cekNilai(){
        System.out.println("\n");
        System.out.println("Nilai Anda : ");
        System.out.println("Progdas : " + getNilaiProgdas());
        System.out.println("Orkom : " + getNilaiOrkom());
        System.out.println("Kalkulus : " + getNilaiKalkulus());
        System.out.println("\n");

        System.out.printf("Rata-rata : %.1f\n", hitungRata());
        if(Hasil >= 70){
            System.out.println("Status : LULUS\n");
        }else{
            System.out.println("Status : GAGAL\n");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int input_Progdas, input_Kalkulus, input_Orkom;

        Perhitungan x = new Perhitungan();

        System.out.println("\n");
        System.out.print("Nilai Progdas : ");
        input_Progdas = input.nextInt();
        x.setNilaiProgdas(input_Progdas);

        System.out.print("Nilai Orkom : ");
        input_Orkom = input.nextInt();
        x.setNilaiOrkom(input_Orkom); 

        System.out.print("Nilai Kalkulus : ");
        input_Kalkulus = input.nextInt();
        x.setNilaiKalkulus(input_Kalkulus);

        x.cekNilai();
        input.close(); 
    }

}
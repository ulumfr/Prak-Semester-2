public class Perhitungan {

    private int NilaiProgdas, NilaiKalkulus, NilaiOrkom;
    private double hitungRata;
    
    public void setnilaiProgdas(int NilaiProgdas) {
        this.NilaiProgdas = NilaiProgdas;
    }

    public int getnilaiProgdas() {
        return NilaiProgdas;
    }

    public void setnilaiKalkulus(int NilaiKalkulus) {
        this.NilaiKalkulus = NilaiKalkulus;
    }

    public int getnilaiKalkulus() {
        return NilaiKalkulus;
    }

    public void setnilaiOrkom(int NilaiOrkom) {
        this.NilaiOrkom = NilaiOrkom;
    }

    public int getnilaiOrkom() {
        return NilaiOrkom;
    }

    public double hitungrata(){
        return hitungRata = ( NilaiProgdas + NilaiKalkulus + NilaiOrkom ) / 3.0 ;
    }

    public void cekNilai(){
        System.out.println("\n");
        System.out.println("Nilai Anda : ");
        System.out.println("Progdas : " + getnilaiProgdas());
        System.out.println("Orkom : " + getnilaiOrkom());
        System.out.println("Kalkulus : " + getnilaiKalkulus());
        System.out.println("\n");

        System.out.printf("Rata-rata : %.1f\n", hitungrata());
        if(hitungRata >= 70){
            System.out.println("Status : LULUS\n");
        }else{
            System.out.println("Status : GAGAL\n");
        }
    }
}
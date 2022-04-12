import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main time = new Main();
        time.inputkonversi();
    }

    public void inputkonversi(){
        int pilih; 
        Scanner input = new Scanner(System.in);
        Konversi bulan = new Konversi();
        
        System.out.println("\nKalkulator Konversi Waktu Bulan ke-(Detik, Menit, Jam, Hari)");

        System.out.print("\nMasukkan Waktu Bulan : ");
        pilih = input.nextInt();
        bulan.setPilih(pilih);

        bulan.Proses();
        bulan.Menu();

        input.close();
    }
}

import java.util.Scanner;

public class Konversi {
    Scanner input = new Scanner(System.in);

    private long detik, menit, jam;
    private int hari, pilih;

    public void setPilih(int pilih){
        this.pilih = pilih;
    }

    public void Proses(){
        hari = pilih*30;
        jam = pilih*30*24;
        menit = jam*60;
        detik = menit*60;
    }

    public void Menu() {
        int tekan;
        Main x = new Main();

        System.out.println("\nHasil Koversi Waktu : \n");
        System.out.println(pilih + " Bulan Sama Dengan "+ hari + " Hari");
        System.out.println(pilih + " Bulan Sama Dengan "+ jam + " Jam");
        System.out.println(pilih + " Bulan Sama Dengan "+ menit + " Menit");
        System.out.println(pilih + " Bulan Sama Dengan "+ detik + " Detik\n");

        System.out.print("Tekan 1 Untuk Lanjut / Tekan 0 Untuk Exit : ");
        tekan = input.nextInt();
        if(tekan == 1){
            System.out.println("\n");
            x.inputkonversi();
        }else{
            System.exit(1);
        }
        input.close();
    }
    
}

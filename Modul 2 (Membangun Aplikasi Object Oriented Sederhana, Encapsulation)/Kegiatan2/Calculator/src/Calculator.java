import java.util.Scanner;

public class Calculator {
    Scanner input  = new Scanner(System.in);

    private double diagonal1, diagonal2, sisi;
    private int pilih; 
    private double keliling, luas;

    public double Keliling(){
        return keliling = sisi * 4;
    }

    public double Luas(){
        return luas = 0.5 * (diagonal1 * diagonal2);
    }

    public void menuKeliling(){ 
        Main Cal = new Main();

        System.out.println("\n==========================================");
        System.out.println("Keliling Belah Ketupat\n");
        System.out.print("Inputkan Sisi Belah Ketupat = ");
        sisi = input.nextDouble();
        
        System.out.printf("Hasil Keliling Belah Ketupat Adalah = %.1f\n", Keliling());
        System.out.println("==========================================");

        System.out.print("Tekan 1 Untuk Lanjut / Tekan 0 Untuk Exit : ");
        pilih = input.nextInt();
        if(pilih == 1){
            System.out.println("\n");
            Cal.menuCalculator();
        }else{
            System.exit(1);
        }
        input.close();
    }

    public void menuLuas(){ 
        Main Cal = new Main();

        System.out.println("\n==========================================");
        System.out.println("Luas Belah Ketupat\n");
        System.out.print("Inputkan diagonal 1 = ");
        diagonal1 = input.nextDouble();
        System.out.print("Inputkan diagonal 2 = ");
        diagonal2 = input.nextDouble();

        System.out.printf("Hasil Luas Belah Ketupat Adalah = %.1f\n",Luas());
        System.out.println("==========================================");

        System.out.print("Tekan 1 Untuk Lanjut / Tekan 0 Untuk Exit : ");
        pilih = input.nextInt();
        if(pilih == 1){
            System.out.println("\n");
            Cal.menuCalculator();
        }else{
            System.exit(1);
        }
        input.close();
    }
}
import java.util.Scanner;

public class Calculator {
    Scanner input  = new Scanner(System.in);

    private double diagonal1, diagonal2, sisi;

    public double Keliling(){
        return(sisi*4);
    }

    public double Luas(){
        return (diagonal1 * diagonal2) * 0.5;
    }

    public void menuKeliling(){ 
        System.out.println("\n=================================================");
        System.out.println("Keliling Belah Ketupat\n");
        System.out.print("Inputkan Sisi Belah Ketupat = ");
        sisi = input.nextDouble();
        System.out.printf("Hasil Keliling Belah Ketupat = %.1f\n", Keliling());
        System.out.println("=================================================");
    }
    
    public void menuLuas(){ 
        System.out.println("\n=================================================");
        System.out.println("Luas Belah Ketupat\n");
        System.out.print("Inputkan diagonal 1 = ");
        diagonal1 = input.nextDouble();
        System.out.print("Inputkan diagonal 2 = ");
        diagonal2 = input.nextDouble();
        System.out.printf("Hasil Luas Belah Ketupat = %.1f\n", Luas());
        System.out.println("=================================================");
    }
}   

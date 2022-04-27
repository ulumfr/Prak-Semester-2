import java.util.Scanner;

public class CalcuOOP {
    
    private double diagonal1, diagonal2, sisi;
    int inputMenu;
    char back;

    Scanner input  = new Scanner(System.in);
    Main ok = new Main();

    public double Keliling(){
        return (sisi * 4);
    }

    public double Luas(){
        return (diagonal1 * diagonal2) * 0.5;
    }
    public void mainOOP(){
        System.out.println("\nKalkulator Bangun Belah Ketupat (OOP)");
        System.out.println("1. Hitung Keliling\n2. Hitung Luas\n");
        System.out.print("Inputkan pilihan : ");
        inputMenu = input.nextInt();
        switch(inputMenu){
            case 1 :
                menuKeliling();
            
            case 2 :
                menuLuas();
            
            default :
                System.out.println("Mohon Maaf Anda Salah Input");
        }
        backMenu();
    }

    public void menuKeliling(){ 
    
        System.out.println("\n=================================================");
        System.out.println("Keliling Belah Ketupat\n");
        System.out.print("Inputkan Sisi Belah Ketupat = ");
        sisi = input.nextDouble();
        
        System.out.printf("Hasil Keliling Belah Ketupat = " + Keliling());
        System.out.println("\n=================================================");
    }

    public void menuLuas(){ 

        System.out.println("\n=================================================");
        System.out.println("Luas Belah Ketupat\n");
        System.out.print("Inputkan diagonal 1 = ");
        diagonal1 = input.nextDouble();
        System.out.print("Inputkan diagonal 2 = ");
        diagonal2 = input.nextDouble();

        System.out.printf("Hasil Luas Belah Ketupat = " + Luas());
        System.out.println("\n=================================================");

    }

    public void backMenu(){
        System.out.print("\nKembali ke menu ? y/n : ");
            back = input.next().charAt(0);
            if(back == 'Y' || back == 'y'){
                System.out.println("\n");
                mainOOP();
            }else if(back == 'N' || back == 'n'){
                ok.menuCalculator();
            }else{
                System.out.println("Inputan Salah");
                backMenu();
            }
    }
}
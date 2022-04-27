import java.util.Scanner;

public class Structured {
    
    public void mainStructured(){
        double diagonal1, diagonal2, sisi;
        char back;
        Scanner input = new Scanner(System.in);
        Main Str = new Main();

        System.out.println("\nKalkulator Bangun Belah Ketupat (Structured)");
        System.out.println("1. Hitung Keliling\n2. Hitung Luas\n");
        System.out.print("Inputkan pilihan : ");
        int inputMenu = input.nextInt();
        switch(inputMenu){
            case 1 : 
                System.out.println("\nKeliling Belah Ketupat\n");
                System.out.print("Inputkan Sisi Belah Ketupat = "); 
                sisi = input.nextDouble();
                System.out.printf("\nHasil Keliling Belah Ketupat = " + (sisi * 4));

            case 2 :
                System.out.println("\nLuas Belah Ketupat\n");
                System.out.print("Inputkan diagonal 1 = ");
                diagonal1 = input.nextDouble();
                System.out.print("Inputkan diagonal 2 = ");
                diagonal2 = input.nextDouble();
                System.out.printf("\nHasil Luas Belah Ketupat = " + (diagonal1 * diagonal2) * 0.5);

            default :
                System.out.println("Mohon Maaf Anda Salah Input");
        } input.close();

        System.out.print("\nKembali ke menu ? y/n : ");
        back = input.next().charAt(0);
        if(back == 'Y' || back == 'y'){
            System.out.println("\n");
            mainStructured();
        }else{
            Str.menuCalculator();
        }      
    }
}

    /*    public static void main(String[] args) {
        double diagonal1, diagonal2, sisi, keliling, luas;
        int inputMenu;

        Scanner input = new Scanner(System.in);

        System.out.println("\n========= KELILING & LUAS BELAH KETUPAT =========\n");
        System.out.println("1. Keliling Belah Ketupat\n2. Luas Belah Ketupat\n");
        System.out.print("Inputkan Nomor Menu : ");
        inputMenu = input.nextInt();
        if(inputMenu == 1 ){ 
            System.out.println("\n=================================================");
            System.out.println("Keliling Belah Ketupat\n");
            System.out.print("Inputkan Sisi Belah Ketupat = ");
            sisi = input.nextDouble();
            keliling = (sisi * 4);
            System.out.printf("Hasil Keliling Belah Ketupat = %.1f\n", keliling);
            System.out.println("=================================================");
        }else if(inputMenu == 2){
            System.out.println("\n=================================================");
            System.out.println("Luas Belah Ketupat\n");
            System.out.print("Inputkan diagonal 1 = ");
            diagonal1 = input.nextDouble();
            System.out.print("Inputkan diagonal 2 = ");
            diagonal2 = input.nextDouble();
            luas = (diagonal1 * diagonal2) * 0.5;
            System.out.printf("Hasil Luas Belah Ketupat = %.1f\n", luas);
            System.out.println("=================================================");
        }else{
            System.out.println("Mohon Maaf Anda Salah Input");
        }
        input.close();
    }
}
*/
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
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
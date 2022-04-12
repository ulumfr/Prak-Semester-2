import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main ke = new Main();
        ke.menuCalculator();
    }

    public void menuCalculator(){
        Calculator aa = new Calculator();
        Scanner input = new Scanner(System.in);
        int pilih;

        System.out.println("========= KELILING & LUAS BELAH KETUPAT =========\n");
        System.out.println("1. Keliling Belah Ketupat\n2. Luas Belah Ketupat\n");
        System.out.print("Inputkan Nomor Menu : ");
        pilih = input.nextInt();
        if(pilih == 1 ){
            aa.menuKeliling();
        }else if (pilih == 2){
            aa.menuLuas();
        }else{
            System.out.println("Mohon Maaf Anda Salah Input");
            System.out.println("\n");
            menuCalculator();
        }
        input.close();
    }
}

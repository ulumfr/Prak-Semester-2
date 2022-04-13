import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main ke = new Main();
        ke.menuCalculator();
    }

    public void menuCalculator(){
        Calculator aa = new Calculator();
        Scanner input = new Scanner(System.in);
        int inputMenu;

        System.out.println("\n========= KELILING & LUAS BELAH KETUPAT =========\n");
        System.out.println("1. Keliling Belah Ketupat\n2. Luas Belah Ketupat\n");
        System.out.print("Inputkan Nomor Menu : ");
        inputMenu = input.nextInt();
            
        if(inputMenu == 1 ){
            aa.menuKeliling();
        }else if (inputMenu == 2){
            aa.menuLuas();
        }else{
            System.out.println("Mohon Maaf Anda Salah Input");
            System.out.println("\n");
            menuCalculator();
        }
        input.close();
    }
}

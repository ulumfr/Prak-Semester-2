import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main ke = new Main();
        ke.menuCalculator();
    }

    public void menuCalculator(){
        
        Scanner input = new Scanner(System.in);
        CalcuOOP aw = new CalcuOOP();
        Structured wa = new Structured();
        int inputMenu;

        System.out.println("\n========= KALKULATOR BELAH KETUPAT =========\n");
        System.out.println("1. OOP\n2. Terstruktur\n3. Exit\n");
        System.out.print("Inputkan Nomor Menu : ");
        inputMenu = input.nextInt();
            
        if(inputMenu == 1 ){
            aw.mainOOP();
        }else if(inputMenu == 2){
            wa.mainStructured();
        }else if(inputMenu == 3){
            System.exit(0);
        }
        input.close();
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input_Progdas, input_Orkom, input_Kalkulus;

        Perhitungan x = new Perhitungan();

        System.out.println("\n");
        System.out.print("Nilai Progdas : ");
        input_Progdas = input.nextInt();
        x.setnilaiProgdas(input_Progdas);

        System.out.print("Nilai Orkom : ");
        input_Orkom = input.nextInt();
        x.setnilaiOrkom(input_Orkom); 

        System.out.print("Nilai Kalkulus : ");
        input_Kalkulus = input.nextInt();
        x.setnilaiKalkulus(input_Kalkulus);

        x.cekNilai();
        input.close();
    }
}
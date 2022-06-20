package Kegiatan.src;

import java.io.*;
import java.util.InputMismatchException;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main2 {
    
    static dinasPertanahan dP = new dinasPertanahan();
    static Scanner input = new Scanner(System.in);

    static boolean Status = true;
    static String next; 

    public static void main(String[] args) throws Exception{
        Menu();
    }

    public static void Menu() throws Exception {
        System.out.println("======== Dinas Pertanahan UMM ========");
        System.out.println("\n1. Create\n2. Read\n3. Exit\n");
        System.out.print("Pilih Menu Anda : ");

        int Menu = input.nextInt();

        switch (Menu){
            case 1 : input(); Menu(); break;
            case 2 : display(); Menu(); break;
            case 3 : System.exit(0); break;
            default : System.out.println("Mohon Maaf Pilihan Anda Salah!"); Menu();
        }
    }

    public static void input() throws Exception {

        try {
            FileWriter fw = new FileWriter("Tanah.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            String alamat;
            int panjang_tanah, luas_tanah;

            while (Status) {
                
                System.out.printf("Masukan Alamat\t\t: ");
                dP.setalamat(input.next());
                alamat = dP.getalamat();

                System.out.printf("Masukan Panjang Tanah\t: ");
                dP.setpanjangTanah(input.nextInt());
                panjang_tanah = dP.getpanjangTanah();

                System.out.printf("Masukan Luas Tanah\t: ");
                dP.setluasTanah(input.nextInt());
                luas_tanah = dP.getluasTanah();

                String tulis = String.format("%s, %s, %s\n", alamat, panjang_tanah, luas_tanah);
                bw.write(tulis);

                System.out.print("Apakah Ingin Input Lagi? ");
                next = input.next();
                Status = next.equalsIgnoreCase("y");

            }
            bw.close();
        } catch (InputMismatchException a) {
            System.err.println(a);
        } finally { 
         Menu();
        }
        input.close();

    }

    public static void display() throws Exception {

        try{
            FileReader fr = new FileReader("Tanah.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String baca = br.readLine();

            int i = 1;

            System.out.printf("%-2s %-20s %-15s %-15s\n", "No", "Alamat", "Panjang Tanah", "Luas Tanah");
            
            //Show Data
            while (baca != null) {
                StringTokenizer st = new StringTokenizer(baca, ",");

                String alamat, panjang_tanah, luas_tanah;

                alamat = st.nextToken();
                panjang_tanah = st.nextToken();
                luas_tanah = st.nextToken();

                //Output 
                System.out.printf("%2d %-20s %-15s %-15s\n", i++, alamat, panjang_tanah, luas_tanah);
                baca = br.readLine();
            }
            br.close(); fr.close();

        } catch (FileNotFoundException b) {
            System.err.println(b); Menu();
        } finally {
         Menu();
        }
    }

}

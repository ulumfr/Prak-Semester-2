package Kegiatan1.src;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pertanahan {
    public static void main(String[] args) throws IOException{
        dinasPertanahan p = new dinasPertanahan();
        File f1 = new File("dinasPertanahan.txt");
        Scanner input = new Scanner(System.in);

        boolean status = true; 
        System.out.printf("Masukan Alamat\t\t: ");
        p.setalamat(input.nextLine());

        do{
            status = false; 
            try {
                System.out.printf("Masukan Panjang Tanah\t: ");
                p.setpanjangTanah(input.nextInt());
                
                System.out.printf("Masukan Luas Tanah\t: ");
                p.setluasTanah(input.nextInt());

                FileWriter f2 = new FileWriter(f1, true);
                f2.write(p.getalamat() + "\n"  + p.getluasTanah() + "\n" + p.getpanjangTanah() + "\n");
                f2.close();
            } catch (IOException e) {
                System.out.println(e);
                status = true;
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e);
                status = true;
                input.nextLine();
            }
        } while (status);
        input.close();

        String baris;
        int urutan = 0;

        BufferedReader read = new BufferedReader(new FileReader(f1));
        System.out.println("Data yang sudah masuk");
        while ((baris = read.readLine()) != null) {
            urutan++;
            System.out.println("======== Dinas Pertanahan UMM ========");
            System.out.printf("===== Informasi tanah ke %d =====\n", urutan);
            System.out.println("Alamat Tanah : " + baris);
            System.out.println("Panjang Tanah: " + read.readLine());
            System.out.println("Lebar Tanah  : " + read.readLine());
            System.out.println("Luas Tanah   : " + read.readLine());
        }
        read.close();
    }
}
